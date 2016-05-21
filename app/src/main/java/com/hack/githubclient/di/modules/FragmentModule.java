package com.hack.githubclient.di.modules;

import android.support.v4.app.Fragment;

import com.hack.githubclient.di.scope.PerFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ww on 2016/5/21.
 */

@Module
public class FragmentModule {

    private final Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @PerFragment
    @Provides
    public Fragment provideFragment() {
        return fragment;
    }
}
