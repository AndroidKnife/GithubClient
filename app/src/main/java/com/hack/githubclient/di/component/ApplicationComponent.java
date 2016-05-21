package com.hack.githubclient.di.component;

import android.app.Application;

import com.hack.githubclient.LocalPersistent;
import com.hack.githubclient.di.modules.ApplicationModule;
import com.hack.githubclient.serivce.ApiService;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {ApplicationModule.class})
@Singleton
public interface ApplicationComponent {

    Application application();

    ApiService apiService();

    LocalPersistent localPersistent();
}