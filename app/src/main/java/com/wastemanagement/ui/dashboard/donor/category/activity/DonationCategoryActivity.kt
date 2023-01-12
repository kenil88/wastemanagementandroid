package com.wastemanagement.ui.dashboard.donor.category.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.wastemanagement.R
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivityDonationCategoryBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.dashboard.donor.category.adapter.DonarCategoryListAdapter
import com.wastemanagement.ui.dashboard.listner.ClickListener
import com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel
import com.wastemanagement.ui.dashboard.viewmodel.CategoryViewModel
import com.wastemanagement.ui.dashboard.donor.organization.activity.OrganizationsActivity
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility

class DonationCategoryActivity : BaseActivity(),View.OnClickListener, ClickListener {

    private val viewModel: CategoryViewModel by viewModels()

    lateinit var binding : ActivityDonationCategoryBinding
    lateinit var mDonationCategoryAdapter: DonarCategoryListAdapter
    var categoryList=ArrayList<DonationCategoryModel.Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDonationCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()

    }

    /**
     * Method is used to initialize data and views
     */
    private fun init()
    {
        binding.imgBack.setOnClickListener(this)
        setObserver()
        viewModel.categoryList()
    }

    /**
     * Set observer
     */
    private fun setObserver() {
        viewModel.categoryResponse.observe(this) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(this)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { category ->
                        categoryList.clear()
                        categoryList.addAll(category.data)
                        if(categoryList.size>0) {
                            binding.txtNoData.visibility=View.GONE
                            setAdapter()
                        }
                        else
                        {
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

    private fun setAdapter()
    {
        mDonationCategoryAdapter= DonarCategoryListAdapter(this, categoryList,this)
        binding.recyclerDonationCategory.adapter=mDonationCategoryAdapter
    }

    override fun onClick(p0: View?) {
        when (p0)
        {
            binding.imgBack->
                finish()
        }
    }

    override fun onCategoryClick(position: Int) {
        var intent=Intent(this@DonationCategoryActivity, OrganizationsActivity::class.java)
        intent.putExtra(Constants.IntentConstants.CATEGORY_ID,categoryList[position].id)
        startActivity(intent)
    }
}