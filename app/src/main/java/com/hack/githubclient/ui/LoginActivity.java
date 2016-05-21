package com.hack.githubclient.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.hack.githubclient.R;
import com.hack.githubclient.di.component.ActivityComponer;
import com.hack.githubclient.di.component.DaggerActivityComponer;
import com.hack.githubclient.di.modules.ActivityModule;

import javax.inject.Inject;

/**
 * Created by Asuka on 16/5/21.
 */
public class LoginActivity extends Activity {

    @Inject
    protected String mString;

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActivityComponer componer = DaggerActivityComponer.builder().activityModule(new ActivityModule(this)).build();
        componer.inject(this);
        mTextView = (TextView) findViewById(R.id.textView);
        mTextView.setText(mString);
    }
}
