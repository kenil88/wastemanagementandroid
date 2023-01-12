package com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.wastemanagement.R
import com.wastemanagement.databinding.ItemRequestListBinding
import com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel
import com.wastemanagement.ui.dashboard.listner.ClickListener
import kotlin.collections.ArrayList

/**
 * Adapter class is used to display recent chat list
 */
class RequestListAdapter(
    var mContext: Context, var requestList: ArrayList<RequestListModel.Result>,
    var listeners: ClickListener
) :
    RecyclerView.Adapter<RequestListAdapter.ViewHolder>() {

    /**
     * class used to bind layout
     */
    inner class ViewHolder(itemBinding: ItemRequestListBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        var itemBinding: ItemRequestListBinding? = null
        init {
            this.itemBinding = itemBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRequestListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
            return requestList.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemBinding!!.txtDonorName.text=requestList[position].donorName
        holder.itemBinding!!.txtDonorContact.text=requestList[position].donorContact
        holder.itemBinding!!.txtDonorEmail.text=requestList[position].donorEmail
        holder.itemBinding!!.txtDonorAddress.text=requestList[position].donorLocation
        holder.itemBinding!!.txtDonationDescription.text=requestList[position].description



        if(requestList[position].isAccepted=="0")
        {
            holder.itemBinding!!.layoutAcceptOrReject.visibility=View.VISIBLE
        }
        else
        {
            holder.itemBinding!!.layoutAcceptOrReject.visibility=View.GONE
            holder.itemBinding!!.txtRequestStatus.visibility=View.VISIBLE
            if(requestList[position].isAccepted=="1")
            {
                holder.itemBinding!!.txtRequestStatus.setBackgroundColor(ContextCompat.getColor(mContext,
                    R.color.colorPrimary))
                holder.itemBinding!!.txtRequestStatus.text= mContext.getString(R.string.request_accepted)
            }
            else
            {
                holder.itemBinding!!.txtRequestStatus.setBackgroundColor(ContextCompat.getColor(mContext,
                    R.color.red))
                holder.itemBinding!!.txtRequestStatus.text= mContext.getString(R.string.request_rejected)
            }
        }


        holder.itemBinding!!.viewpagerAttachments.offscreenPageLimit =
           requestList[position].requestImage.size
        var communityDetailPageIndicator = AttachmentPageIndicator(
            mContext,
            requestList[position].requestImage
        )
        holder.itemBinding!!.viewpagerAttachments.adapter = communityDetailPageIndicator
        if ( requestList[position].requestImage.size > 0) {
            holder.itemBinding!!.layoutAttachments.visibility = View.VISIBLE
            holder.itemBinding!!.pageCount.text = "1/" +  requestList[position].requestImage.size
        } else {
            holder.itemBinding!!.layoutAttachments.visibility = View.GONE
        }

        holder.itemBinding!!.viewpagerAttachments.addOnPageChangeListener(object :
            ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
                // onPageScrollStateChanged
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                // onPageScrolled
            }

            override fun onPageSelected(position: Int) {
                // Check if this is the page you want.
                holder.itemBinding!!.pageCount.text =
                    "" + (position + 1) + "/" +  requestList[position].requestImage.size
            }
        })


        holder.itemBinding!!.txtAccept.setOnClickListener {
            listeners.onRequestUpdate(requestList[position].requestId,1)
        }

        holder.itemBinding!!.txtReject.setOnClickListener {
            listeners.onRequestUpdate(requestList[position].requestId.toInt(),2)
        }


    }
}
