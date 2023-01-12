package com.wastemanagement.ui.dashboard.donor.donationrequest

import android.Manifest
import android.app.Activity
import android.content.ContentResolver
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.webkit.MimeTypeMap
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import com.wastemanagement.R
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivityDonationRequestBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.dashboard.acceptor.activity.AcceptorDrawerActivity
import com.wastemanagement.ui.dashboard.donor.donationrequest.adapter.AddPhotoAdapter
import com.wastemanagement.ui.dashboard.donor.donationrequest.model.AddPhotoModel
import com.wastemanagement.ui.dashboard.donor.organization.listner.OrganizationClickListener
import com.wastemanagement.ui.dashboard.viewmodel.DonationRequestViewModel
import com.wastemanagement.ui.dashboard.viewmodel.ProfileVIewModel
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility
import droidninja.filepicker.FilePickerBuilder
import droidninja.filepicker.FilePickerConst
import droidninja.filepicker.utils.ContentUriUtils
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File
import java.util.*
import kotlin.collections.HashMap

class DonationRequestActivity : BaseActivity(), View.OnClickListener,
    OrganizationClickListener {

    lateinit var binding: ActivityDonationRequestBinding
    var organizationId = 0
    var organizationName = ""
    var latitude = "0.0"
    var longitude = "0.0"

    private var imagesArray: ArrayList<AddPhotoModel> = ArrayList()
    private var photoPaths = ArrayList<Uri>()
    lateinit var addPhotoAdapter: AddPhotoAdapter
    val MAX_IMAGES = 3

    private val donationRequestViewModel: DonationRequestViewModel by viewModels()

    private val startPlacesAutoSearchResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val place = Autocomplete.getPlaceFromIntent(result.data)
                latitude = place.latLng?.latitude!!.toString()
                longitude = place.latLng?.longitude!!.toString()
                binding.txtDonorLocation.setText(place.name + "," + place.address)
            } else {
                result.data.let {
                    val status = Autocomplete.getStatusFromIntent(result.data)
                    status.statusMessage?.let { it1 -> Log.e("Organization Location", it1) }
                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDonationRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
        setObserver()
    }

    /**
     * Method is used to initialize data and views
     */
    private fun init() {
        intent.getIntExtra(Constants.IntentConstants.ORGANIZATION_ID, 0).let {
            organizationId = it
        }
        intent.getStringExtra(Constants.IntentConstants.ORGANIZATION_NAME).let {
            organizationName = it.toString()
        }

        binding.imgBack.setOnClickListener(this)
        binding.txtDonorLocation.setOnClickListener(this)
        binding.btnUploadImages.setOnClickListener(this)
        binding.btnSendRequest.setOnClickListener(this)
        // init google place to search address
        Places.initialize(
            this@DonationRequestActivity,
            resources.getString(R.string.google_maps_key)
        )

        binding.edAcceptorName.setText(organizationName)
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.imgBack -> finish()
            binding.txtDonorLocation -> callAutoSearch()
            binding.btnUploadImages -> {
                var maxValue = MAX_IMAGES - imagesArray.size
                if (maxValue == 0) {
                    Utility.showToastMessage(
                        this,
                        "You have attached maximum images",
                    )
                } else {
                    uploadMultipleImages()
                }
            }
            binding.btnSendRequest -> {
                if (checkValidation()) {
                    val builder = MultipartBody.Builder()
                    builder.setType(MultipartBody.FORM)

                    builder.addFormDataPart(
                        "donor_name",
                        binding.edDonorName.text.toString().trim()
                    )
                    builder.addFormDataPart(
                        "donor_contact", binding.edDonorContact.text.toString().trim()
                    )
                    builder.addFormDataPart(
                        "donor_email",
                        binding.edDonorEmail.text.toString().trim()
                    )
                    builder.addFormDataPart(
                        "donor_location", binding.txtDonorLocation.text.toString().trim()
                    )
                    builder.addFormDataPart("acceptor_id", organizationId.toString())
                    builder.addFormDataPart(
                        "description",
                        binding.edDonationDescription.text.toString().trim()
                    )
                    /* upload Multiple Images *****/
                    if (imagesArray.size > 0) {
                        for (x in 0 until imagesArray.size) {
                            val fileEvent = File(imagesArray[x].path)
                            if (fileEvent != null) {
                                val requestFile: RequestBody = RequestBody.create(
                                    "multipart/form-data".toMediaTypeOrNull(),
                                    fileEvent
                                )
                                val multipartBodyEvent = MultipartBody.Part.createFormData(
                                    "images[]", imagesArray[x].path, requestFile
                                )
                                builder.addPart(multipartBodyEvent)

                            }
                        }
                    }
                    val requestBody: MultipartBody = builder.build()
                    donationRequestViewModel.adddDonationRequest(requestBody)
                }
            }
        }
    }

    /**
     * Set observer
     */
    private fun setObserver() {
        donationRequestViewModel.addRequestResponse.observe(this) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(this)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    finish()
                }
                Status.ERROR -> {
                    hideProgress()
                    it.message?.let { it1 ->
                        Utility.showAlertMessage(
                            this,
                            getString(R.string.app_name),
                            it1
                        )
                    }
                }
                Status.NO_INTERNET -> {
                    Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }


    /**
     * This method is used to manage selection of images and video in filepicker library
     * Also manage runtime permission for storage access.
     */
    fun uploadMultipleImages() {
        TedPermission.with(this@DonationRequestActivity)
            .setPermissionListener(object : PermissionListener {
                override fun onPermissionGranted() {
                    FilePickerBuilder.instance
                        .setMaxCount(MAX_IMAGES) //optional
                        .setSelectedFiles(photoPaths)
                        .setActivityTheme(R.style.LibAppTheme) //optional
                        .enableVideoPicker(false)
                        .setImageSizeLimit(5)
                        .enableCameraSupport(false)
                        .showGifs(false)
                        .enableSelectAll(false)
                        .setActivityTitle("Select Images")
                        .pickPhoto(this@DonationRequestActivity, 1001);
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    // onPermissionDenied
                }
            }).setDeniedMessage(getString(R.string.permission_denied))
            .setPermissions(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE
            )
            .check()
    }


    /**
     * manage auto search places
     */
    private fun callAutoSearch() {
        val fields =
            listOf(Place.Field.ID, Place.Field.NAME, Place.Field.ADDRESS, Place.Field.LAT_LNG)
        val intent = Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, fields)
            .build(this@DonationRequestActivity)
        startPlacesAutoSearchResult.launch(intent)
    }

    /**
     * This method is used to manage image and video for the post.
     */
    private fun displaySelectedImageAndVideo() {
        if (imagesArray.size > 0) {
            binding.recyclerDonationAttachments.layoutManager =
                LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
            addPhotoAdapter = AddPhotoAdapter(this, imagesArray, this)
            binding.recyclerDonationAttachments.adapter = addPhotoAdapter

        }
    }


    /**
     * manage result for image and video pick from gallery and google places.
     **/
    override fun
            onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1001 && resultCode == RESULT_OK && data != null) {
            photoPaths.clear()
            data.getParcelableArrayListExtra<Uri>(FilePickerConst.KEY_SELECTED_MEDIA)?.let {
                photoPaths.addAll(it)
            }

            for (i in 0 until photoPaths.size) {
                var doc = AddPhotoModel()
                doc.path = ContentUriUtils.getFilePath(this, photoPaths[i])!!
                doc.uri = photoPaths[i]
                imagesArray.add(doc)
            }
            displaySelectedImageAndVideo()
        }
    }

    override fun onOrganizationClick(position: Int) {
        if (imagesArray.size > 0) {
            imagesArray.removeAt(position)
            photoPaths.removeAt(position)
            if (addPhotoAdapter != null) {
                addPhotoAdapter.notifyDataSetChanged()
            }
        }
    }

    /**
     * Method is used to check all value are valid or not
     */
    fun checkValidation(): Boolean {
        if (TextUtils.isEmpty(binding.edDonorName.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter donor name")
            return false
        } else if (TextUtils.isEmpty(binding.edDonorContact.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter donor contact number")
            return false
        } else if (binding.edDonorContact.text.toString()
                .trim().length < 10 || binding.edDonorContact.text.toString().trim().length > 13
        ) {
            Utility.showToastMessage(this, "Enter valid donor contact number")
            return false
        } else if (TextUtils.isEmpty(binding.edDonorEmail.text.toString().trim())
        ) {
            Utility.showToastMessage(this, "Enter donor email address")
            return false
        } else if (!Utility.isValidEmail(binding.edDonorEmail.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter valid donor email address")
            return false
        } else if (TextUtils.isEmpty(binding.txtDonorLocation.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter donor location")
            return false
        } else if (TextUtils.isEmpty(binding.edDonationDescription.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter donation description")
            return false
        }

        return true
    }

}