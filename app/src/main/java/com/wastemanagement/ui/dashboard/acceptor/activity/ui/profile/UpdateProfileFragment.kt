package com.wastemanagement.ui.dashboard.acceptor.activity.ui.profile

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import com.wastemanagement.R
import com.wastemanagement.core.BaseFragment
import com.wastemanagement.databinding.FragmentUpdateProfileBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.dashboard.acceptor.activity.AcceptorDrawerActivity
import com.wastemanagement.ui.dashboard.viewmodel.ProfileVIewModel
import com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel
import com.wastemanagement.ui.dashboard.viewmodel.CategoryViewModel
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility

class UpdateProfileFragment : BaseFragment(), View.OnClickListener {

    lateinit var binding:FragmentUpdateProfileBinding
    var categoryList = ArrayList<DonationCategoryModel.Data>()
    var strCategoryId = "-1"
    private val categoryViewModel: CategoryViewModel by viewModels()
    private val profileViewModel: ProfileVIewModel by viewModels()
    var latitude="0.0"
    var longitude="0.0"
    lateinit var mContext: Context

    private val startPlacesAutoSearchResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val place = Autocomplete.getPlaceFromIntent(result.data)
                latitude = place.latLng?.latitude!!.toString()
                longitude = place.latLng?.longitude!!.toString()
                binding.txtOrganizationLocation.setText(place.name + "," + place.address)
            } else {
                result.data.let {
                    val status = Autocomplete.getStatusFromIntent(result.data)
                    status.statusMessage?.let { it1 -> Log.e("Organization Location", it1) }
                }
            }
        }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext=context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUpdateProfileBinding.inflate(inflater, container, false)
        val root: View = binding.root
        init()
        return root
    }


    /**
     * Method is used to initialize data and views
     */
    private fun init() {
        binding.btnUpdateProfile.setOnClickListener(this)
        binding.txtOrganizationLocation.setOnClickListener(this)
        // init google place to search address
        Places.initialize(
            mContext,
            resources.getString(R.string.google_maps_key)
        )
        setObserver()
        categoryViewModel.categoryList()
    }

    /**
     * set Profile data to UI
     */
    private fun setProfileData()
    {
        binding.edFirstname.setText(preferences.getPreference(Constants.PrefKeys.firstName))
        binding.edLastname.setText(preferences.getPreference(Constants.PrefKeys.lastName))
        binding.edEmail.setText(preferences.getPreference(Constants.PrefKeys.email))
        binding.edOrganizationName.setText(preferences.getPreference(Constants.PrefKeys.orgName))
        binding.txtOrganizationLocation.setText(preferences.getPreference(Constants.PrefKeys.orgLocation))
        binding.edOrganizationContact.setText(preferences.getPreference(Constants.PrefKeys.orgContact))
        latitude=preferences.getPreference(Constants.PrefKeys.latitude)!!
        longitude=preferences.getPreference(Constants.PrefKeys.longitude)!!
        var selectedCategory=categoryList.find { it.id==preferences.getPreference(Constants.PrefKeys.categoryId)?.toInt() }
        binding.spOrganizationCategory.setSelection(categoryList.indexOf(selectedCategory))
    }


    override fun onClick(p0: View?) {
        when (p0) {
            binding.btnUpdateProfile -> {

                if(checkValidation()) {
                    var params = HashMap<String, String>()
                    params.put("email", binding.edEmail.text.toString().trim())
                    params.put("first_name", binding.edFirstname.text.toString().trim())
                    params.put("last_name", binding.edLastname.text.toString().trim())
                    params.put("org_name", binding.edOrganizationName.text.toString().trim())
                    params.put("org_location", binding.txtOrganizationLocation.text.toString().trim())
                    params.put("org_contact", binding.edOrganizationContact.text.toString().trim())
                    params.put("category_id", strCategoryId)
                    params.put("latitude", latitude)
                    params.put("longitude", longitude)
                    profileViewModel.updateProfile(preferences.getPreference(Constants.PrefKeys.userid)!!.toInt(),params)
                }
            }
            binding.txtOrganizationLocation ->{
                callAutoSearch()
            }
        }
    }
    /**
     * manage auto search places
     */
    private fun callAutoSearch() {
        val fields =
            listOf(Place.Field.ID, Place.Field.NAME, Place.Field.ADDRESS, Place.Field.LAT_LNG)
        val intent = Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, fields)
            .build(mContext)
        startPlacesAutoSearchResult.launch(intent)
    }

    /**
     * Set observer
     */
    private fun setObserver() {
        categoryViewModel.categoryResponse.observe(viewLifecycleOwner) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(mContext as AcceptorDrawerActivity)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { category ->
                        categoryList.addAll(category.data)
                        setCategoryListAdapter()
                        setProfileData()

                    }
                }
                Status.ERROR -> {
                    hideProgress()
                    it.message?.let { it1 ->
                        Utility.showAlertMessage(
                            mContext,
                            getString(R.string.app_name),
                            it1
                        )
                    }
                }
                Status.NO_INTERNET -> {
                    Toast.makeText(mContext, it.message, Toast.LENGTH_SHORT).show()
                }
            }
        }

        profileViewModel.profileResponse.observe(viewLifecycleOwner) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(mContext as AcceptorDrawerActivity)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { userData ->
                        if(userData.status) {
                            preferences.setPreference(Constants.PrefKeys.userid,userData.result.userId.toString())
                            preferences.setPreference(Constants.PrefKeys.firstName,userData.result.firstName)
                            preferences.setPreference(Constants.PrefKeys.lastName,userData.result.lastName)
                            preferences.setPreference(Constants.PrefKeys.email,userData.result.email)
                            preferences.setPreference(Constants.PrefKeys.orgName,userData.result.orgName)
                            preferences.setPreference(Constants.PrefKeys.orgContact,userData.result.orgContact)
                            preferences.setPreference(Constants.PrefKeys.orgLocation,userData.result.orgLocation)
                            preferences.setPreference(Constants.PrefKeys.latitude,userData.result.latitude)
                            preferences.setPreference(Constants.PrefKeys.longitude,userData.result.longitude)
                            preferences.setPreference(Constants.PrefKeys.categoryId,userData.result.categoryId.toString())
                            preferences.setPreference(Constants.PrefKeys.categoryName,userData.result.categoryName)
                            (mContext as AcceptorDrawerActivity).updateDrawerData()
                            Utility.showToastMessage(mContext as AcceptorDrawerActivity,"Update Profile Successfully.")
                            setProfileData()
//                            startActivity(
//                                Intent(
//                                    mContext,
//                                    AcceptorDashboardActivity::class.java
//                                )
//                            )
                        }
                        else
                        {
                            Utility.showToastMessage(mContext as AcceptorDrawerActivity,userData.message)
                        }
                    }
                }
                Status.ERROR -> {
                    hideProgress()
                    it.message?.let { it1 ->
                        Utility.showAlertMessage(
                            mContext,
                            getString(R.string.app_name),
                            it1
                        )
                    }
                }
                Status.NO_INTERNET -> {
                    Toast.makeText(mContext, it.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    /**
     * This is used to set category list to dropdown
     */
    private fun setCategoryListAdapter() {

        val adapter = ArrayAdapter(
            mContext,
            android.R.layout.simple_spinner_dropdown_item, categoryList
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spOrganizationCategory.setAdapter(adapter);
        binding.spOrganizationCategory.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    strCategoryId = categoryList.get(position).id.toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // onNothingSelected
                }
            }
    }


    /**
     * Method is used to check all value are valid or not
     */
    fun checkValidation(): Boolean {
        if (TextUtils.isEmpty(binding.edFirstname.text.toString().trim())) {
            Utility.showToastMessage(mContext as AcceptorDrawerActivity, "Enter first name")
            return false
        } else if (TextUtils.isEmpty(binding.edLastname.text.toString().trim())) {
            Utility.showToastMessage(mContext as AcceptorDrawerActivity, "Enter last name")
            return false
        } else if (TextUtils.isEmpty(binding.edEmail.text.toString().trim())
        ) {
            Utility.showToastMessage(mContext as AcceptorDrawerActivity, "Enter email address")
            return false
        } else if (!Utility.isValidEmail(binding.edEmail.text.toString().trim())) {
            Utility.showToastMessage(mContext as AcceptorDrawerActivity, "Enter valid email address")
            return false
        } else if (TextUtils.isEmpty(binding.edOrganizationName.text.toString().trim())) {
            Utility.showToastMessage(mContext as AcceptorDrawerActivity, "Enter organization name")
            return false
        } else if (TextUtils.isEmpty(binding.txtOrganizationLocation.text.toString().trim())) {
            Utility.showToastMessage(mContext as AcceptorDrawerActivity, "Enter organization location")
            return false
        }
        else if (TextUtils.isEmpty(binding.edOrganizationContact.text.toString().trim())) {
            Utility.showToastMessage(mContext as AcceptorDrawerActivity, "Enter organization contact")
            return false
        }
        else if (binding.edOrganizationContact.text.toString().trim().length < 10 || binding.edOrganizationContact.text.toString().trim().length > 13) {
            Utility.showToastMessage(mContext as AcceptorDrawerActivity, "Enter valid organization contact number")
            return false
        }
        return true
    }


}