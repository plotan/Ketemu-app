package com.example.ketemu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class AccountActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_layout);

        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.navigationMenu);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home_nav:
                        Intent b = new Intent(AccountActivity.this,MainActivity.class);
                        startActivity(b);
                        break;
                    case R.id.Found_nav:
                        Intent a = new Intent(AccountActivity.this,FoundActivity.class);
                        startActivity(a);
                        break;
                    case R.id.acc_nav:
                        break;
                }
                return false;
            }
        });
    }
}
