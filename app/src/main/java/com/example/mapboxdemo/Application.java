package com.example.mapboxdemo;

import android.graphics.Bitmap;

import com.mapbox.mapboxsdk.Mapbox;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Mapbox.getInstance(this, getString(R.string.mapbox_access_token));

    }
}
