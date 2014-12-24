package com.pdt.daggerexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.pdt.daggerexample.inject.DaggerExampleApplication;

public abstract class BaseActivityWithInjection extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerExampleApplication.get(this).inject(this);
    }
}
