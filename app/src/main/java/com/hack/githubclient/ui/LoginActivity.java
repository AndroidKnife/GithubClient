package com.hack.githubclient.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.hack.githubclient.R;
import com.hack.githubclient.ui.base.BaseActivityView;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by Asuka on 16/5/21.
 */
public class LoginActivity extends BaseActivityView<LoginPresenter> {

    @BindView(R.id.textView)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter.fetchTitle();
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_login;
    }

    @Override
    protected void injectComponent() {
        getActivityComponent().inject(this);
    }

    @OnClick(R.id.textView)
    public void a(){
        Log.d("aaa","AAaaaa");
    }

    public void showTitle(String title) {
        mTextView.setText(title);
    }
}
