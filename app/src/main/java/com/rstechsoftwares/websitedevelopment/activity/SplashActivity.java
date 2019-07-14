package com.rstechsoftwares.websitedevelopment.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rstechsoftwares.websitedevelopment.R;

/**
 * This is showed on every launch of the application
 */
public class SplashActivity extends AppCompatActivity {

    // Using handler to add some delay
    private final Handler waitHandler = new Handler();
    private final Runnable waitCallBack = () -> {
        startActivity(new Intent(SplashActivity.this, OnBoardingActivity.class));
        overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
        finish();
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 3000 ms = 3 seconds
        waitHandler.postDelayed(waitCallBack, 3000);
    }

    @Override
    protected void onDestroy() {
        waitHandler.removeCallbacks(waitCallBack);
        super.onDestroy();
    }
}
