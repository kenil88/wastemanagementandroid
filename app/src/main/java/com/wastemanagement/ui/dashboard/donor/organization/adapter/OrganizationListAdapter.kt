package com.wastemanagement.ui.dashboard.donor.organization.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wastemanagement.databinding.ItemOrganizationBinding
import com.wastemanagement.ui.dashboard.donor.organization.listner.OrganizationClickListener
import com.wastemanagement.ui.dashboard.donor.organization.model.OrganizationListModel
import kotlin.collections.ArrayList

/**
 * Adapter class is used to display recent chat list
 */
class OrganizationListAdapter(
    var mContext: Context, var organizationList: ArrayList<OrganizationListModel.Result>,
    var listeners: OrganizationClickListener
) :
    RecyclerView.Adapter<OrganizationListAdapter.ViewHolder>() {

    /**
     * class used to bind layout
     */
    inner class ViewHolder(itemBinding: ItemOrganizationBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        var itemBinding: ItemOrganizationBinding? = null
        init {
            this.itemBinding = itemBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemOrganizationBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        if (organizationList != null && organizationList.size > 0) {
            return organizationList.size
        } else return 0
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var organizationData = organizationList.get(position)
        holder.itemBinding!!.txtOrganiationName.setText(organizationData.orgName)
        holder.itemBinding!!.txtOrganiationLocality.setText(organizationData.orgLocation)
        holder.itemBinding!!.txtOrganiationContact.setText(organizationData.orgContact)

        holder.itemBinding!!.btnRequest.setOnClickListener {
            listeners.onOrganizationClick(position)
        }

    }
}
