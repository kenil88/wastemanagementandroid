package com.wastemanagement.ui.dashboard.listner;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/wastemanagement/ui/dashboard/listner/ClickListener;", "", "onCategoryClick", "", "position", "", "onRequestUpdate", "id", "status", "app_debug"})
public abstract interface ClickListener {
    
    public abstract void onCategoryClick(int position);
    
    public abstract void onRequestUpdate(int id, int status);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void onCategoryClick(@org.jetbrains.annotations.NotNull()
        com.wastemanagement.ui.dashboard.listner.ClickListener $this, int position) {
        }
        
        public static void onRequestUpdate(@org.jetbrains.annotations.NotNull()
        com.wastemanagement.ui.dashboard.listner.ClickListener $this, int id, int status) {
        }
    }
}