package com.wastemanagement;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = WasteManagementApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface WasteManagementApp_GeneratedInjector {
  void injectWasteManagementApp(WasteManagementApp wasteManagementApp);
}
