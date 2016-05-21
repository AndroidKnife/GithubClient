package com.hack.githubclient;

import android.app.Application;

import com.hack.githubclient.di.component.DaggerApplicationComponent;
import com.hack.githubclient.di.modules.ApplicationModule;

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }
}
