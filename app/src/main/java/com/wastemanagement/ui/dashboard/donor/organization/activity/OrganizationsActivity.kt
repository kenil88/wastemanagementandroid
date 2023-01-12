package com.wastemanagement.ui.dashboard.donor.organization.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.wastemanagement.R
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivityOrganizationsBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.dashboard.donor.donationrequest.DonationRequestActivity
import com.wastemanagement.ui.dashboard.donor.organization.adapter.OrganizationListAdapter
import com.wastemanagement.ui.dashboard.donor.organization.listner.OrganizationClickListener
import com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel
import com.wastemanagement.ui.dashboard.viewmodel.OrganizationViewModel
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility

class OrganizationsActivity : BaseActivity(), View.OnClickListener, OrganizationClickListener,OnMapReadyCallback,OnMarkerClickListener {

    lateinit var binding: ActivityOrganizationsBinding
    lateinit var mOrganizationListAdapter: OrganizationListAdapter
    var categoryId = 0
    private val organizationViewModel: OrganizationViewModel by viewModels()
    var organizationList = ArrayList<OrganizationListModel.Result>()
    var isListView=true

    private var mMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrganizationsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    /**
     * Method is used to initialize data and views
     */
    private fun init() {
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
        intent.getIntExtra(Constants.IntentConstants.CATEGORY_ID, 0).let {
            categoryId = it
        }

        binding.imgBack.setOnClickListener(this)
        binding.imgViewType.setOnClickListener(this)
        setAdapter()
        setObserver()
        loadData()
    }

    override fun onMapReady(p0: GoogleMap) {
        mMap = p0
//        mMap!!.isMyLocationEnabled=true
        Log.e("","Map is ready ")
    }

    /**
     * Method is used to set adapter
     */
    private fun setAdapter() {
        mOrganizationListAdapter = OrganizationListAdapter(this, organizationList, this)
        binding.recyclerDonationCategory.adapter = mOrganizationListAdapter
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.imgBack ->
                finish()
            binding.imgViewType->{

                if(isListView)
                {
                    binding.imgViewType.setImageResource(R.drawable.ic_baseline_format_list_bulleted_24)
                    binding.layoutMapList.visibility=View.VISIBLE
                    binding.layoutListView.visibility-View.GONE
                    isListView=false
                }
                else
                {
                    isListView=true
                    binding.imgViewType.setImageResource(R.drawable.ic_baseline_map_24)
                    binding.layoutMapList.visibility=View.GONE
                    binding.layoutListView.visibility-View.VISIBLE
                }

            }
        }
    }

    fun loadData() {
        var params = HashMap<String, String>()
        params.put("category_id", categoryId.toString())
        organizationViewModel.organizationList(params)
    }


    /**
     * Set observer
     */
    private fun setObserver() {
        organizationViewModel.organizationResponse.observe(this) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(this)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { organizationResponse ->
                        organizationList.clear()
                        organizationList.addAll(organizationResponse.result)
                        if(organizationList.size>0) {
                            binding.txtNoData.visibility=View.GONE
                            setAdapter()
                            addMarkerToMap()
                        }
                        else{
                            binding.txtNoData.visibility=View.VISIBLE
                        }

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

    /**
     * Method is used to add marker in map
     */
    private fun addMarkerToMap()
    {
//        val builder = LatLngBounds.builder()
        for (organization in organizationList)
        {
            val sydney = LatLng(organization.latitude.toDouble(), organization.longitude.toDouble())
            Log.e("","\"Organization Name : ${organization.orgName}\\n\" +\n" +
                    "                            \"Address : ${organization.orgLocation}\\n\" +\n" +
                    "                            \"latlang : ${organization.longitude},${organization.longitude} \"")

            mMap!!.addMarker(
                MarkerOptions()
                    .position(sydney)
                    .snippet("${organization.orgContact}")
                    .title("${organization.orgName}")
            )

//            builder.include(
//                LatLng(
//                    organization.latitude.toDouble(),
//                    organization.longitude.toDouble()
//                )
//            )
        }
        var latlng=LatLng(organizationList[0].latitude.toDouble(), organizationList[0].longitude.toDouble())
        mMap!!.animateCamera(CameraUpdateFactory.newLatLngZoom(latlng, 5f))

//        val bounds = builder.build()
//        try {
//            mMap!!.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 250))
//        } catch (e: java.lang.Exception) {
//            Log.e("TAG_SNAP", "onClusterClick: " + e.message)
//        }
    }

    override fun onOrganizationClick(position: Int) {
        var requestIntent=Intent(this,DonationRequestActivity::class.java)
        requestIntent.putExtra(Constants.IntentConstants.ORGANIZATION_NAME,organizationList[position].orgName)
        requestIntent.putExtra(Constants.IntentConstants.ORGANIZATION_ID,organizationList[position].id)
        startActivity(requestIntent)
    }

    override fun onMarkerClick(p0: Marker): Boolean {

        val builder = LatLngBounds.builder()
        for (item in organizationList) {
            builder.include(
                LatLng(
                    item.latitude.toDouble(),
                    item.longitude.toDouble()
                )
            )
        }
        val bounds = builder.build()
        try {
            mMap!!.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 250))
        } catch (e: java.lang.Exception) {
            Log.e("TAG_SNAP", "onClusterClick: " + e.message)
        }
        return true
    }


}