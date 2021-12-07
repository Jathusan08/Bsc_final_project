package com.example.jathusanuthayakumaran.j2;

import io.mapwize.mapwizeformapbox.AccountManager;
import android.app.Application;

/*** Created by jathusanuthayakumaran on 28/02/2018.*/

public class MapwizeApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AccountManager.start(this, "ebb54f7f85b2564931c5180307b7e1a7");
    }
}
