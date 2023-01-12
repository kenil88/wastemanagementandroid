package com.wastemanagement.ui.dashboard.donor.category.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wastemanagement.ui.dashboard.donor.category.model.DonationCategoryModel
import com.wastemanagement.databinding.ItemDonationCategoryBinding
import com.wastemanagement.ui.dashboard.listner.ClickListener
import kotlin.collections.ArrayList

/**
 * Adapter class is used to display recent chat list
 */
class DonarCategoryListAdapter(
    var mContext: Context, var categoryList: ArrayList<DonationCategoryModel.Data>,
    var listeners: ClickListener
) :
    RecyclerView.Adapter<DonarCategoryListAdapter.ViewHolder>() {

    /**
     * class used to bind layout
     */
    inner class ViewHolder(itemBinding: ItemDonationCategoryBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        var itemBinding: ItemDonationCategoryBinding? = null
        init {
            this.itemBinding = itemBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemDonationCategoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        if (categoryList != null && categoryList.size > 0) {
            return categoryList.size
        } else return 0
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var categoryData = categoryList.get(position)
        holder.itemBinding!!.btnCategoryTitle.setText(categoryData.title)

        holder.itemBinding!!.btnCategoryTitle.setOnClickListener {
            listeners.onCategoryClick(position)
        }

    }
}
