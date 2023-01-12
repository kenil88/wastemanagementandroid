package com.wastemanagement.ui.auth.activity

import android.app.Activity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import com.wastemanagement.R
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivityRegisterBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.auth.viewmodel.AuthViewModel
import com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel
import com.wastemanagement.ui.dashboard.viewmodel.CategoryViewModel
import com.wastemanagement.utils.Utility

class RegisterActivity : BaseActivity(), View.OnClickListener {
    private val AUTOCOMPLETE_REQUEST_CODE = 119
    lateinit var binding: ActivityRegisterBinding
    private val categoryViewModel: CategoryViewModel by viewModels()
    private val registerViewModel: AuthViewModel by viewModels()
    var categoryList = ArrayList<DonationCategoryModel.Data>()
    var strCategoryId = "-1"
    var latitude="0.0"
    var longitude="0.0"

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    /**
     * Method is used to initialize data and views
     */
    private fun init() {
        binding.btnRegister.setOnClickListener(this)
        binding.imgBack.setOnClickListener(this)
        binding.txtOrganizationLocation.setOnClickListener(this)
        categoryViewModel.categoryList()

        // init google place to search address
        Places.initialize(
            this@RegisterActivity,
            resources.getString(R.string.google_maps_key)
        )


        setObserver()
    }

    /**
     * Set observer
     */
    private fun setObserver() {
        categoryViewModel.categoryResponse.observe(this) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(this)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { category ->
                        categoryList.addAll(category.data)
                        setCategoryListAdapter()
                    }
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

        registerViewModel.registerResponse.observe(this) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(this)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { userData ->
                        Toast.makeText(this@RegisterActivity, userData.message, Toast.LENGTH_SHORT).show()
                        finish()
                    }
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

    override fun onClick(p0: View?) {
        when (p0) {
            binding.btnRegister -> {

                if(checkValidation()) {
                    var params = HashMap<String, String>()
                    params.put("email", binding.edEmail.text.toString().trim())
                    params.put("password", binding.edPassword.text.toString().trim())
                    params.put("first_name", binding.edFirstname.text.toString().trim())
                    params.put("last_name", binding.edLastname.text.toString().trim())
                    params.put("org_name", binding.edOrganizationName.text.toString().trim())
                    params.put("org_location", binding.txtOrganizationLocation.text.toString().trim())
                    params.put("org_contact", binding.edOrganizationContact.text.toString().trim())
                    params.put("category_id", strCategoryId)
                    params.put("latitude", latitude)
                    params.put("longitude", longitude)
                    registerViewModel.register(params)
                }
            }

            binding.imgBack ->
                finish()
            binding.txtOrganizationLocation ->{
                callAutoSearch()
            }

        }
    }

    /**
     * This is used to set category list to dropdown
     */
    private fun setCategoryListAdapter() {

        val adapter = ArrayAdapter(
            this,
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
     * manage auto search places
     */
    private fun callAutoSearch() {
        val fields =
            listOf(Place.Field.ID, Place.Field.NAME, Place.Field.ADDRESS, Place.Field.LAT_LNG)
        val intent = Autocomplete.IntentBuilder(AutocompleteActivityMode.OVERLAY, fields)
            .build(this@RegisterActivity)
        startPlacesAutoSearchResult.launch(intent)
    }



    /**
     * Method is used to check all value are valid or not
     */
    fun checkValidation(): Boolean {
        if (TextUtils.isEmpty(binding.edFirstname.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter first name")
            return false
        } else if (TextUtils.isEmpty(binding.edLastname.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter last name")
            return false
        } else if (TextUtils.isEmpty(binding.edEmail.text.toString().trim())
        ) {
            Utility.showToastMessage(this, "Enter email address")
            return false
        } else if (!Utility.isValidEmail(binding.edEmail.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter valid email address")
            return false
        } else if (TextUtils.isEmpty(binding.edOrganizationName.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter organization name")
            return false
        }
        else if (strCategoryId=="-1") {
            Utility.showToastMessage(this, "Please Select Category")
            return false
        }
        else if (TextUtils.isEmpty(binding.txtOrganizationLocation.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter organization location")
            return false
        }
        else if (TextUtils.isEmpty(binding.edOrganizationContact.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter organization contact")
            return false
        }
        else if (binding.edOrganizationContact.text.toString().trim().length < 10 || binding.edOrganizationContact.text.toString().trim().length > 13) {
            Utility.showToastMessage(this, "Enter valid organization contact number")
            return false
        } else if (TextUtils.isEmpty(binding.edPassword.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter password")
            return false
        } else if (TextUtils.isEmpty(binding.edConfirmPassword.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter confirm password")
            return false
        } else if (!binding.edConfirmPassword.text.toString().trim().equals(binding.edPassword.text.toString().trim())) {
            Utility.showToastMessage(this, "Password and confirm password must be same")
            return false
        }
        return true
    }

}