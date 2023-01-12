package com.wastemanagement.utils


import android.content.Context
import android.graphics.Color
import android.text.Spanned
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import androidx.core.text.HtmlCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.wastemanagement.R
import com.google.android.material.snackbar.Snackbar


object ViewUtils {

    fun View.show() {
        visibility = View.VISIBLE
    }

    fun View.hide() {
        visibility = View.GONE
    }

    fun View.disable() {
        alpha = .3f
        isClickable = false
    }

    fun View.enable() {
        alpha = 1f
        isClickable = true
    }

    // with no alpha
    fun View.isDisable() {
        isClickable = false
        isEnabled = false
    }

    fun View.isEnable() {
        isClickable = true
        isEnabled = true
    }

    fun String?.toHtml(): Spanned? {
        if (this.isNullOrEmpty()) return null
        return HtmlCompat.fromHtml(this, HtmlCompat.FROM_HTML_MODE_COMPACT)
    }

    /**
     * Show snackBar
     */
    fun snackBar(message: String, view: View) {
        val snackBar = Snackbar.make(
            view, message,
            Snackbar.LENGTH_LONG
        )
        val snackBarView = snackBar.view
        snackBarView.setBackgroundColor(view.context.getColor(com.wastemanagement.R.color.colorPrimary))
        val textView =
            snackBarView.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
        textView.setTextColor(Color.WHITE)
        val typeface = ResourcesCompat.getFont(view.context, com.wastemanagement.R.font.lato_regular)
        textView.textSize = 13f
        textView.typeface = typeface
        snackBarView.setPadding(0, 0, 0, 0)
        snackBar.show()
    }

    /**
     * Show loadImage
     */

    fun loadImage(context: Context?, url: String, imageView: ImageView?) {
        try {
            Glide.with(context!!)
                .load(url.replace("\\s", "").trim { it <= ' ' })
                .apply(
                    RequestOptions.placeholderOf(R.mipmap.app_logo)
                        .error(R.mipmap.app_logo)
                        .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(imageView!!)
        } catch (e: Exception) {
            Logger.e("Error :", e.message!!)
        }
    }
}

