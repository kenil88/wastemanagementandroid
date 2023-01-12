package com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.wastemanagement.R
import com.wastemanagement.core.BaseFragment
import com.wastemanagement.databinding.FragmentDashboardBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.dashboard.acceptor.activity.AcceptorDrawerActivity
import com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter.RequestListAdapter
import com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel
import com.wastemanagement.ui.dashboard.listner.ClickListener
import com.wastemanagement.ui.dashboard.viewmodel.DonationRequestViewModel
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility

class DashboardFragment : BaseFragment(), ClickListener {
    lateinit var binding: FragmentDashboardBinding
    lateinit var adapter: RequestListAdapter
    lateinit var mContext: Context
    private val donationRequestViewModel: DonationRequestViewModel by viewModels()
    var requestList: ArrayList<RequestListModel.Result> = ArrayList()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
        initialize()
        return root
    }

    /**
     * Method is used to initialize data and views
     */
    private fun initialize() {
        setObserver()
        donationRequestViewModel.getDonationRequestList(
            preferences.getPreference(Constants.PrefKeys.userid)!!.toInt()
        )

        //refresh page on swipe
        binding.swipeContainer.setOnRefreshListener {

            binding.swipeContainer.isRefreshing = false;
            donationRequestViewModel.getDonationRequestList(
                preferences.getPreference(Constants.PrefKeys.userid)!!.toInt()
            )

        }
    }

    /**
     * Set observer
     */
    private fun setObserver() {
        donationRequestViewModel.getDonationRequestResponse.observe(viewLifecycleOwner) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(mContext as AcceptorDrawerActivity)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { requestResponse ->
                        requestList.clear()
                        requestList.addAll(requestResponse.result)
                        Log.e("", "Request List====${requestList.size}")
                        setAdapterData()
                        if(requestList.size>0) {
                            binding.txtNoData.visibility=View.GONE
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

        donationRequestViewModel.getDonationRequestUpdateResponse.observe(viewLifecycleOwner) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(mContext as AcceptorDrawerActivity)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { requestStatusResponse ->
                        donationRequestViewModel.getDonationRequestList(
                            preferences.getPreference(Constants.PrefKeys.userid)!!.toInt()
                        )
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
     * Method is used to set adapter for request list
     */
    private fun setAdapterData() {
        var layoutManager = LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false)
        binding.recyclerRequestList.layoutManager = layoutManager
        adapter = RequestListAdapter(mContext, requestList, this)
        binding.recyclerRequestList.adapter = adapter

    }

    override fun onRequestUpdate(id: Int, status: Int) {
        super.onRequestUpdate(id, status)
        donationRequestViewModel.getDonationRequestUpdate(id,status)
    }
}