package com.hack.githubclient;

import android.app.Application;

import com.hack.githubclient.di.component.ApplicationComponent;
import com.hack.githubclient.di.component.DaggerApplicationComponent;
import com.hack.githubclient.di.modules.ApplicationModule;

public class AppApplication extends Application {

//    private static AppApplication mAppApplication;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }

}
