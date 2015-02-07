package com.android.mario.lifecycle.activity;

/**
 * Created by Sakurai on 2/7/2015.
 */

import android.os.Bundle;

public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }



}