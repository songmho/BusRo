package com.busro.busro;

import android.app.Activity;
import android.content.Intent;
import android.os.*;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import java.util.logging.Handler;

/**
 * Created by 은별 on 2016-01-07.
 */
public class SplashActivity extends AppCompatActivity {
    int SPLASHTIME = 2000;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, SPLASHTIME);

    }
}
