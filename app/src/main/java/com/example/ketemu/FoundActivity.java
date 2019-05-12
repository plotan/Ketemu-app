package com.example.ketemu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class FoundActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.found_layout);

        BottomNavigationView navigationView = findViewById(R.id.navigationMenu);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home_nav:
                        Intent a = new Intent(FoundActivity.this,MainActivity.class);
                        startActivity(a);
                        break;
                    case R.id.Found_nav:
                        break;
                    case R.id.acc_nav:
                        Intent b = new Intent(FoundActivity.this,AccountActivity.class);
                        startActivity(b);
                        break;
                }
                return false;
            }
        });


    }
}
