package com.wastemanagement.utils

import android.app.Activity
import android.app.ActivityManager
import android.content.Context
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.os.Build
import android.provider.Settings
import android.text.Html
import android.text.InputFilter
import android.text.Spanned
import android.text.TextUtils
import android.util.Base64
import android.util.Log
import android.util.Patterns
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.annotation.ColorRes
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.core.text.buildSpannedString
import androidx.core.text.color
import com.wastemanagement.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.textfield.TextInputLayout
import java.text.SimpleDateFormat
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.regex.Matcher
import java.util.regex.Pattern

object Utility {

    val commonCentsPref = "CommonCentsPreference"

    private lateinit var dot: Array<ImageView?>

    fun log(message: String) {
        android.util.Log.d("TAG", "rs $message")
    }


    fun TextView.setDrawableColor(@ColorRes color: Int) {
        compoundDrawables.filterNotNull().forEach {
        }
    }

    fun isRunning(ctx: Context): Boolean {
        val activityManager = ctx.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val tasks = activityManager.getRunningTasks(Int.MAX_VALUE)
        for (task in tasks) {
            if (ctx.packageName.equals(
                    task.baseActivity!!.packageName,
                    ignoreCase = true
                )
            ) return true
        }
        return false
    }

    /**
     * Check email address is valid or not
     */
    private fun validEmail(email: String): Boolean {
        val pattern: Pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(email).matches()
    }

    fun isValidPassword(password: String): Boolean {
        val passwordREGEX = Pattern.compile(
            "^" +
                    "(?=.*[0-9])" +         //at least 1 digit
                    "(?=.*[a-z])" +         //at least 1 lower case letter
                    "(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@!#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{8,}" +               //at least 8 characters
                    "$"
        );
        return passwordREGEX.matcher(password).matches()
    }

    fun spacefilterForET(): Array<InputFilter> {
        var filter =
            InputFilter { source, start, end, dest, dstart, dend ->
                for (i in start until end) {
                    if (Character.isWhitespace(source[i])) {
                        return@InputFilter ""
                    }
                }
                null
            }
        return arrayOf(filter)
    }

    fun TextInputLayout.markRequiredInRed() {
        hint = buildSpannedString {
            append(hint)
            color(Color.RED) { append(" *") } // Mind the space prefix.
        }
    }

    fun TextInputLayout.markRequiredInGray() {
        hint = buildSpannedString {
            append(hint)
            color(Color.GRAY) { append(" *") } // Mind the space prefix.
        }
    }

    fun btnEnableDisable(context: Context, view: LinearLayout, enable: Boolean, color: Int) {
        view.isEnabled = enable
        view.background.setColorFilter(
            ContextCompat.getColor(
                context,
                color
            ), android.graphics.PorterDuff.Mode.SRC_IN
        )
    }

    fun setBlackNWhiteFilter(imageView: ImageView) {
        val grayscaleMatrix = ColorMatrix()
        grayscaleMatrix.setSaturation(0f)
        imageView.setColorFilter(ColorMatrixColorFilter(grayscaleMatrix))
    }

    fun getAndroidVersion(): String? {
        val release = Build.VERSION.RELEASE
        val sdkVersion = Build.VERSION.SDK_INT
        return release
    }

    fun blinkTextView(imgStatus: ImageView) {
        val anim: Animation = AlphaAnimation(0.0f, 1.0f)
        anim.duration = 150 //You can manage the blinking time with this parameter

        anim.startOffset = 20
        anim.repeatMode = Animation.REVERSE
        anim.repeatCount = Animation.INFINITE
        imgStatus.startAnimation(anim)
    }

    fun checkForUpdate(
        existingVersion: String,
        newVersion: String,
    ): Boolean {
        var existingVersion = existingVersion
        var newVersion = newVersion
        if (existingVersion.isEmpty() || newVersion.isEmpty()) {
            return false
        }
        log("SSS version " + existingVersion)
        log("SSS version " + newVersion)


        existingVersion = existingVersion.replace("\\.".toRegex(), "")
        newVersion = newVersion.replace("\\.".toRegex(), "")
        val existingVersionLength = existingVersion.length
        val newVersionLength = newVersion.length
        val versionBuilder = StringBuilder()
        if (newVersionLength > existingVersionLength) {
            versionBuilder.append(existingVersion)
            for (i in existingVersionLength until newVersionLength) {
                versionBuilder.append("0")
            }
            existingVersion = versionBuilder.toString()
        } else if (existingVersionLength > newVersionLength) {
            versionBuilder.append(newVersion)
            for (i in newVersionLength until existingVersionLength) {
                versionBuilder.append("0")
            }
            newVersion = versionBuilder.toString()
        }
        return newVersion.toInt() > existingVersion.toInt()
    }


    fun getDayFromDate(date: Date): String {
        //  Friday 8th May

        val day = android.text.format.DateFormat.format("d", date) as String // 20
        return day
    }

    fun getHourFromDate(date: Date): String {
        //  Friday 8th May
        val day = android.text.format.DateFormat.format("kk", date) as String // 20
        return day
    }

    fun getMinuteFromDate(date: Date): String {
        val day = android.text.format.DateFormat.format("mm", date) as String // 20
        return day
    }

    fun getMonthFromDate(date: Date): String {
        val monthString =
            android.text.format.DateFormat.format("MMM", date) as String // Jun
        return monthString
    }

    fun getMonthNumberFromDate(date: Date): String {
        val monthString =
            android.text.format.DateFormat.format("MM", date) as String // Jun
        return monthString
    }

    fun getyearFromDate(date: Date): String {
        //  Friday 8th May
        val year = android.text.format.DateFormat.format("yyyy", date) as String // 2013
        return year
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun setDateFormat(date: String, strDateFormat: String): String {

        // val sdf = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        // var consultationDate = sdf.parse(date)
        val dateTime = OffsetDateTime.parse(date).toZonedDateTime() // parsed date
        val formatter = DateTimeFormatter.ofPattern(strDateFormat)
        return dateTime.format(formatter)
        /*  //  Friday 8th May
          val format1 = SimpleDateFormat("dd/MM/yyyy")
          val dt1 = format1.parse(date)

          val format2 = SimpleDateFormat("EEEE")
          val day = format2.format(dt1)

          val format3 = SimpleDateFormat("dd")
          var date = format3.format(dt1)

          val format4 = SimpleDateFormat("MMM")
          val month = format4.format(dt1)

          if (Integer.valueOf(date) < 10)
              date = date.substring(1)

          val prefix = getDayOfMonthSuffix(Integer.valueOf(date))
          return day + " " + date + prefix + " " + month*/
    }

    fun getDayOfMonthSuffix(day: Int): String {

        when (day) {
            1, 21, 31 -> return "st"
            2, 22 -> return "nd"
            3, 23 -> return "rd"
            else -> return "th"
        }
    }

    fun convertDateToAnotherFormat(
        date: String,
        inputDateFormat: String,
        outputDateFormat: String
    ): String {
        //  Friday 8th May
        val format1 = SimpleDateFormat(inputDateFormat)
        val dt1 = format1.parse(date)

        val format2 = SimpleDateFormat(outputDateFormat)
        val day = format2.format(dt1)
        return day
    }

    fun emailValidator(email: String?): Boolean {
        val pattern: Pattern
        val matcher: Matcher
        val EMAIL_PATTERN =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
        pattern = Pattern.compile(EMAIL_PATTERN)
        matcher = pattern.matcher(email)
        return matcher.matches()
    }

    fun hideKeyboard(context: Context, view: View) {
        val imm: InputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    /**
     * hide keybord from screen
     * @param context Context of activity
     * @param view view of activity
     */
    fun showKeyboard(context: Context, view: View) {
        val imm: InputMethodManager =
            context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
    }

    /**
     * encode string to base 64
     * @param str String
     */
    fun encodeToBase64(str: String): String {

        val data = str.toByteArray(charset("UTF-8"))
        return Base64.encodeToString(data, Base64.DEFAULT)
    }


    /**
     * Make a View Blink for a desired duration
     *
     * @param view     view that will be animated
     * @param duration for how long in ms will it blink
     * @param offset   start offset of the animation
     * @return returns the same view with animation properties
     */

    fun getDeviceId(context: Context): String {

        Log.e(
            "DEVICE_ID", Settings.Secure.getString(
                context.contentResolver,
                Settings.Secure.ANDROID_ID
            )
        )
        return Settings.Secure.getString(
            context.contentResolver,
            Settings.Secure.ANDROID_ID
        )
    }


    fun getAppVersionName(context: Context): String {
        var appVersionName = ""
        try {
            appVersionName =
                context.packageManager.getPackageInfo(context.packageName, 0).versionName
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        return appVersionName
    }

    /**
     * check email id is valid or not
     */
    fun isValidEmail(target: String): Boolean {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target)
            .matches()
    }

    fun getAppVersionCode(context: Context): Long {
        var appVersionCode = 0L
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                appVersionCode =
                    context.packageManager.getPackageInfo(context.packageName, 0).longVersionCode
            } else {
                appVersionCode =
                    context.packageManager.getPackageInfo(context.packageName, 0)
                        .versionCode.toLong()
            }
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }
        return appVersionCode
    }


    fun showToastMessage(activity: Activity, message: String) {
        Toast.makeText(activity, message, Toast.LENGTH_LONG).show()
    }

    @Suppress("DEPRECATION")
    fun fromHtml(source: String?): Spanned? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(source, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(source)
        }
    }

    private const val HTML_PATTERN = "<(\"[^\"]*\"|'[^']*'|[^'\">])*>"
    private val pattern = Pattern.compile(HTML_PATTERN)
    fun hasHTMLTags(text: String?): Boolean {
        val matcher: Matcher = pattern.matcher(text)
        return matcher.find()
    }

    fun isEmpty(txt: String?): Boolean {
        return txt.toString().trim().isBlank() || txt == null
    }

    fun getTimeDifferenceinMills(
        endTime: Date,
        startTime: Date,
    ): Long {
        var diff = endTime.getTime() - startTime.getTime()
        log("SSS _+" + diff)
        return diff
    }

    fun getDecimalTwoDigit(
        value: Double?,
    ): String {
        value?.let {
            val doubleVal = value.toDouble()
            return String.format("%.2f", doubleVal)
        }
        return "0.00"
    }

    /* fun getPrecentageValue(number: Double): String {
         val value = number % 1
         if (value == 0.0) {
             return number.toInt().toString()
         } else {
             val text = Math.abs(number).toString()
             val integerPlaces = text.indexOf('.')
             val decimalPlaces = text.length - integerPlaces - 1

             if (decimalPlaces > 2) {
                 return getDecimalTwoDigit(number)
             } else {
                 return number.toString()
             }
         }
     }
 */

    fun randomString(stringLength: Int): String {
        val list = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray()
        var randomS = ""
        for (i in 1..stringLength) {
            randomS += list[getRandomNumber(0, list.size - 1)]
        }
        return randomS
    }

    fun getRandomNumber(min: Int, max: Int): Int {
        return Random().nextInt((max - min) + 1) + min
    }

    fun showAlertMessage(context: Context, title: String, message: String) {

        /* Create an Intent that will start the Menu-Activity. */
        MaterialAlertDialogBuilder(
            context,
            R.style.AlertDialogTheme
        )
            .setCancelable(false)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Ok") { dialog, which ->
                dialog.dismiss()
            }
            .show()
    }

    fun setPreference(ctx: Context, key: String, value: String) {
        val pref: SharedPreferences =
            ctx.getSharedPreferences(commonCentsPref, 0) // 0 - for private mode

        val editor: SharedPreferences.Editor = pref.edit()
        editor.putString(key, value); // Storing long
        editor.apply(); // commit changes
    }

    fun removePreference(ctx: Context, key: String) {
        val pref: SharedPreferences =
            ctx.getSharedPreferences(commonCentsPref, 0) // 0 - for private mode

        val editor: SharedPreferences.Editor = pref.edit()
        editor.remove(key); // will delete key name
        editor.apply(); // commit changes
    }

    fun getPreference(ctx: Context, key: String): String? {
        val pref: SharedPreferences =
            ctx.getSharedPreferences(commonCentsPref, 0) // 0 - for private mode
        return pref.getString(key, ""); // getting String
    }

    fun formatPhoneNumber(phoneNum: String): String {
        var count = 0
        val builder = java.lang.StringBuilder()
        for (i in 0 until phoneNum.length) {
            if (i % 3 == 0 && count < 3) {
                if (count > 0)
                    builder.append(" ")
                count++
            }
            builder.append(phoneNum.toCharArray()[i])
        }
        return builder.toString()
    }

    interface PickImageInterface {
        fun onCameraClick()
        fun onGalleryClick()
    }

}


