package com.wastemanagement.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001jB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ&\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u001e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004J\u0010\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0004J\u000e\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020\u0004J\u0012\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010\u0004J\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u000e\u0010,\u001a\u00020-2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010.\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010/\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u000200J\u000e\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u001aJ\u0015\u00103\u001a\u00020\u00042\b\u00104\u001a\u0004\u0018\u000105\u00a2\u0006\u0002\u00106J\u000e\u00107\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u00108\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u000200J\u000e\u00109\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u000200J\u000e\u0010:\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u000200J\u000e\u0010;\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u000200J\u0018\u0010<\u001a\u0004\u0018\u00010\u00042\u0006\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0004J\u0016\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001aJ\u0016\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u0002002\u0006\u0010D\u001a\u000200J\u000e\u0010E\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u000200J\u0010\u0010F\u001a\u00020\u00182\b\u0010G\u001a\u0004\u0018\u00010\u0004J\u0016\u0010H\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020IJ\u0010\u0010J\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010\u0004J\u000e\u0010L\u001a\u00020\u00182\u0006\u0010=\u001a\u00020\u0014J\u000e\u0010M\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u0004J\u000e\u0010O\u001a\u00020\u00182\u0006\u0010P\u001a\u00020\u0004J\u000e\u0010Q\u001a\u00020\u00102\u0006\u0010R\u001a\u00020\u0004J\u000e\u0010S\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u001aJ\u0016\u0010U\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u0004J\u000e\u0010V\u001a\u00020\u00102\u0006\u0010W\u001a\u00020\nJ\u0018\u0010X\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u0004H\u0007J\u001e\u0010Z\u001a\u00020\u00102\u0006\u0010=\u001a\u00020\u00142\u0006\u0010>\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004J\u001e\u0010[\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0004J\u0016\u0010]\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020IJ\u0016\u0010^\u001a\u00020\u00102\u0006\u0010_\u001a\u00020`2\u0006\u0010R\u001a\u00020\u0004J\u0011\u0010a\u001a\b\u0012\u0004\u0012\u00020b0\t\u00a2\u0006\u0002\u0010cJ\u0010\u0010d\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0004H\u0002J\n\u0010e\u001a\u00020\u0010*\u00020fJ\n\u0010g\u001a\u00020\u0010*\u00020fJ\u0014\u0010h\u001a\u00020\u0010*\u00020i2\b\b\u0001\u0010\u0019\u001a\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006k"}, d2 = {"Lcom/wastemanagement/utils/Utility;", "", "()V", "HTML_PATTERN", "", "commonCentsPref", "getCommonCentsPref", "()Ljava/lang/String;", "dot", "", "Landroid/widget/ImageView;", "[Landroid/widget/ImageView;", "pattern", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "blinkTextView", "", "imgStatus", "btnEnableDisable", "context", "Landroid/content/Context;", "view", "Landroid/widget/LinearLayout;", "enable", "", "color", "", "checkForUpdate", "existingVersion", "newVersion", "convertDateToAnotherFormat", "date", "inputDateFormat", "outputDateFormat", "emailValidator", "email", "encodeToBase64", "str", "formatPhoneNumber", "phoneNum", "fromHtml", "Landroid/text/Spanned;", "source", "getAndroidVersion", "getAppVersionCode", "", "getAppVersionName", "getDayFromDate", "Ljava/util/Date;", "getDayOfMonthSuffix", "day", "getDecimalTwoDigit", "value", "", "(Ljava/lang/Double;)Ljava/lang/String;", "getDeviceId", "getHourFromDate", "getMinuteFromDate", "getMonthFromDate", "getMonthNumberFromDate", "getPreference", "ctx", "key", "getRandomNumber", "min", "max", "getTimeDifferenceinMills", "endTime", "startTime", "getyearFromDate", "hasHTMLTags", "text", "hideKeyboard", "Landroid/view/View;", "isEmpty", "txt", "isRunning", "isValidEmail", "target", "isValidPassword", "password", "log", "message", "randomString", "stringLength", "removePreference", "setBlackNWhiteFilter", "imageView", "setDateFormat", "strDateFormat", "setPreference", "showAlertMessage", "title", "showKeyboard", "showToastMessage", "activity", "Landroid/app/Activity;", "spacefilterForET", "Landroid/text/InputFilter;", "()[Landroid/text/InputFilter;", "validEmail", "markRequiredInGray", "Lcom/google/android/material/textfield/TextInputLayout;", "markRequiredInRed", "setDrawableColor", "Landroid/widget/TextView;", "PickImageInterface", "app_debug"})
public final class Utility {
    @org.jetbrains.annotations.NotNull()
    public static final com.wastemanagement.utils.Utility INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String commonCentsPref = "CommonCentsPreference";
    private static android.widget.ImageView[] dot;
    private static final java.lang.String HTML_PATTERN = "<(\"[^\"]*\"|\'[^\']*\'|[^\'\">])*>";
    private static final java.util.regex.Pattern pattern = null;
    
    private Utility() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommonCentsPref() {
        return null;
    }
    
    public final void log(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setDrawableColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setDrawableColor, @androidx.annotation.ColorRes()
    int color) {
    }
    
    public final boolean isRunning(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return false;
    }
    
    /**
     * Check email address is valid or not
     */
    private final boolean validEmail(java.lang.String email) {
        return false;
    }
    
    public final boolean isValidPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.InputFilter[] spacefilterForET() {
        return null;
    }
    
    public final void markRequiredInRed(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout $this$markRequiredInRed) {
    }
    
    public final void markRequiredInGray(@org.jetbrains.annotations.NotNull()
    com.google.android.material.textfield.TextInputLayout $this$markRequiredInGray) {
    }
    
    public final void btnEnableDisable(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout view, boolean enable, int color) {
    }
    
    public final void setBlackNWhiteFilter(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAndroidVersion() {
        return null;
    }
    
    public final void blinkTextView(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgStatus) {
    }
    
    public final boolean checkForUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String existingVersion, @org.jetbrains.annotations.NotNull()
    java.lang.String newVersion) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDayFromDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHourFromDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinuteFromDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonthFromDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMonthNumberFromDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getyearFromDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final java.lang.String setDateFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String strDateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDayOfMonthSuffix(int day) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertDateToAnotherFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String inputDateFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String outputDateFormat) {
        return null;
    }
    
    public final boolean emailValidator(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
        return false;
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * hide keybord from screen
     * @param context Context of activity
     * @param view view of activity
     */
    public final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    /**
     * encode string to base 64
     * @param str String
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String encodeToBase64(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
        return null;
    }
    
    /**
     * Make a View Blink for a desired duration
     *
     * @param view     view that will be animated
     * @param duration for how long in ms will it blink
     * @param offset   start offset of the animation
     * @return returns the same view with animation properties
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppVersionName(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * check email id is valid or not
     */
    public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String target) {
        return false;
    }
    
    public final long getAppVersionCode(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0L;
    }
    
    public final void showToastMessage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"DEPRECATION"})
    public final android.text.Spanned fromHtml(@org.jetbrains.annotations.Nullable()
    java.lang.String source) {
        return null;
    }
    
    public final boolean hasHTMLTags(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return false;
    }
    
    public final boolean isEmpty(@org.jetbrains.annotations.Nullable()
    java.lang.String txt) {
        return false;
    }
    
    public final long getTimeDifferenceinMills(@org.jetbrains.annotations.NotNull()
    java.util.Date endTime, @org.jetbrains.annotations.NotNull()
    java.util.Date startTime) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDecimalTwoDigit(@org.jetbrains.annotations.Nullable()
    java.lang.Double value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String randomString(int stringLength) {
        return null;
    }
    
    public final int getRandomNumber(int min, int max) {
        return 0;
    }
    
    public final void showAlertMessage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void setPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void removePreference(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPreference(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String formatPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNum) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/wastemanagement/utils/Utility$PickImageInterface;", "", "onCameraClick", "", "onGalleryClick", "app_debug"})
    public static abstract interface PickImageInterface {
        
        public abstract void onCameraClick();
        
        public abstract void onGalleryClick();
    }
}