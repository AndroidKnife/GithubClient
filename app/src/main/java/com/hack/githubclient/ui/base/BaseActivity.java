package com.hack.githubclient.ui.base;

import android.app.Activity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Asuka on 16/5/21.
 */
public abstract class BaseActivity extends Activity {

    Unbinder mUnbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        mUnbinder = ButterKnife.bind(this);
    }

    protected abstract int getLayoutID();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }
}
