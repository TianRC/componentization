package com.trc.componentization;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by trc on 2018/4/23.
 */
@Route(path = "/two/activity")
public class TwoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        String text = getIntent().getStringExtra("key");
        Log.d("TwoActivity", text+"~~~~~~");
    }
}
