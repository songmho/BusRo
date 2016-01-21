package com.busro.busro;

import android.app.Activity;
import android.content.Intent;
import android.os.*;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

/**
 * Created by 은별 on 2016-01-07.
 */
public class SplashActivity extends Activity {
    int SPLASHTIME = 2000;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();

            }
        }, SPLASHTIME);
    }
}
