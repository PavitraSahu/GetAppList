package com.example.jiotes.controller;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

import com.example.appinfosdk.controller.AppinfoSDK;

public class MyApp extends Application {
    private AppinfoSDK appinfoSDK;
    @Override
    public void onCreate() {
        super.onCreate();
        appinfoSDK = AppinfoSDK.getAppinfoSDK();
        appinfoSDK.initializeSdk(getApplicationContext());
    }
}
