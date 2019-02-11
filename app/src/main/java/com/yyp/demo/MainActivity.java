package com.yyp.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yyp.statusbar.utils.StatusBarUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //沉浸式、透明、白色图标风格的状态栏
        StatusBarUtils.setUpStatusBar(this, false, true, false);
    }
}
