package com.wastemanagement.ui.dashboard.donor.donationrequest.adapter

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.wastemanagement.databinding.RowAddPhotosBinding
import com.wastemanagement.ui.dashboard.donor.donationrequest.model.AddPhotoModel
import com.wastemanagement.ui.dashboard.donor.organization.listner.OrganizationClickListener
import java.io.File

/**
 * Adapter class is used to manage community post photo
 */
class AddPhotoAdapter(
    var mContext: Context,
    var list: ArrayList<AddPhotoModel>,
    var listeners: OrganizationClickListener
) : RecyclerView.Adapter<AddPhotoAdapter.ViewHolder>() {


    /**
     * class used to bind layout
     */
    inner class ViewHolder(itemBinding: RowAddPhotosBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        var itemBinding: RowAddPhotosBinding? = null
        init {
            this.itemBinding = itemBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = RowAddPhotosBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }


    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


        if (!list[position].path.equals("")) {
            Glide
                .with(mContext)
                .asBitmap()
                .load(Uri.fromFile(File(list[position].path)))
                .into(holder.itemBinding!!.ivAddPhoto);
        }

        holder.itemBinding!!.imgDelete.setOnClickListener {
            listeners.onOrganizationClick(position)
        }

    }
}