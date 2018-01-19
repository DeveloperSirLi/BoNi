package com.bwie.d.boni.app;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by d on 2017/12/29.
 */

public class MyAppcliation extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Fresco.initialize(this);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }
}
