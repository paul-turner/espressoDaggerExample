package com.pdt.daggerexample;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pdt.daggerexample.model.MyRegularOldClassInstance;
import com.pdt.daggerexample.model.MySingleton;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity extends BaseActivityWithInjection {

    private static final String TAG = "MainActivity";

    //Dagger injected objects
    @Inject
    MySingleton mMySingleton;
    @Inject
    MyRegularOldClassInstance mMyRegularOldClassInstance;

    @InjectView(com.pdt.daggerexample.R.id.activity_text)
    TextView mActivityText;

    @InjectView(com.pdt.daggerexample.R.id.start_activity)
    Button mStartActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.pdt.daggerexample.R.layout.activity_main);
        ButterKnife.inject(this);
        Log.d(TAG, "Singleton Instance :" + mMySingleton.toString());
        Log.d(TAG, "Regular Class Instance :" + mMyRegularOldClassInstance);

        mActivityText.setText(Html.fromHtml("mMySingleton: " + mMySingleton.toString() + "<br /><br /> mMyRegularOldClassInstance: " + mMyRegularOldClassInstance.toString()));

        mStartActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

}
