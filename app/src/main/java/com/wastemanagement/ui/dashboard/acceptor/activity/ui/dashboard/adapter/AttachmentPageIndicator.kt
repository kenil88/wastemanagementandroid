package com.wastemanagement.ui.dashboard.acceptor.activity.ui.dashboard.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.*
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.wastemanagement.BuildConfig
import com.wastemanagement.R
import com.wastemanagement.ui.dashboard.acceptor.model.RequestListModel

/**
 * Pager adapter is used to display media of community post
 */
class AttachmentPageIndicator(
    var mContext: Context,
    var imagePostList: ArrayList<RequestListModel.Result.RequestImage>
) : PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        if (imagePostList != null && imagePostList.size != 0)
            return imagePostList.size;
        else
            return 0;
    }

    override fun destroyItem(
        container: ViewGroup, position: Int, `object`: Any
    ) {
        container.removeView(`object` as View)
    }


    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view: View = LayoutInflater.from(container.context)
            .inflate(R.layout.attachment_page, container, false)
        val iv_icon: ImageView = view.findViewById<View>(R.id.iv_icon) as ImageView
        setImageUrl(iv_icon,BuildConfig.IMAGE_BASE_URL+ imagePostList.get(position).path)
        view.setOnClickListener {
            showFullScreenImageDialog(BuildConfig.IMAGE_BASE_URL+imagePostList.get(position).path)
        }
        container.addView(view)
        return view
    }

    /**
     * Method is used to load images
     */
    fun setImageUrl(imageView: ImageView, url: String) {
        val context = imageView.context
        if (url != null && !url.isEmpty()) {
            var strs = url
            Glide.with(context).load(strs)
                .placeholder(R.drawable.placeholder)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .error(R.drawable.placeholder)
                .into(imageView)
        } else {
            Glide.with(context).load(R.drawable.placeholder).into(imageView)
        }
    }


    /**
     * This method is used to enter reason or reporting any user
     * */
    fun showFullScreenImageDialog(imageUrl: String) {
        val dialogBuilder = android.app.AlertDialog.Builder(mContext)
        val inflater = LayoutInflater.from(mContext)
        val dialogView = inflater.inflate(R.layout.dialog_attachmment, null)
        dialogBuilder.setView(dialogView)
        var dialogAttachment = dialogBuilder.create()
        val mWindow = dialogAttachment!!.window
        mWindow!!.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        mWindow.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
        mWindow.setDimAmount(0.8f)
        mWindow.setGravity(Gravity.CENTER)
        mWindow.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val lp = WindowManager.LayoutParams()
        lp.copyFrom(mWindow.attributes)
        lp.width = WindowManager.LayoutParams.MATCH_PARENT
        mWindow.attributes = lp
        dialogAttachment!!.setCancelable(false)
        dialogAttachment!!.setCanceledOnTouchOutside(false)
        dialogAttachment!!.show()
        val imgAttachment = dialogView.findViewById<ImageView>(R.id.imgAttachment)
        val imgClose = dialogView.findViewById<ImageView>(R.id.imgClose)
        setImageUrl(imgAttachment,imageUrl)
        imgClose.setOnClickListener { dialogAttachment.dismiss() }


    }

}