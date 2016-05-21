package com.hack.githubclient.di.component;

import android.app.Application;

import com.hack.githubclient.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {ApplicationModule.class})
@Singleton
public interface ApplicationComponent {

    Application application();
}