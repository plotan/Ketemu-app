package com.example.ketemu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

         new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeInten = new Intent(Splash.this, MainActivity.class);
                startActivity(homeInten);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
