package com.wastemanagement.ui.dashboard.listner


interface ClickListener {

    fun onCategoryClick(position: Int) {}

    fun onRequestUpdate(id: Int,status:Int){}

}