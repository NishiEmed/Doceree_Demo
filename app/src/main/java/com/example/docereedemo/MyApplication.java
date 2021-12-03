package com.example.docereedemo;

import android.app.Application;

import com.doceree.androidadslibrary.ads.DocereeMobileAds;


public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DocereeMobileAds.initialize(this);
    }
}