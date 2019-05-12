package com.example.ketemu;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    BarangAdapter adapter;

    List<Barang> barangList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.navigationMenu);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home_nav:
                        break;
                    case R.id.Found_nav:
                        Intent a = new Intent(MainActivity.this,FoundActivity.class);
                        startActivity(a);
                        break;
                    case R.id.acc_nav:
                        Intent b = new Intent(MainActivity.this,FoundActivity.class);
                        startActivity(b);
                        break;
                }
                return false;
            }
        });


        barangList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        barangList.add(new Barang(
                "Nandar","Lampung","SIM C",R.drawable.ic_person));
        barangList.add(new Barang(
                "Nandar","Lampung","SIM C",R.drawable.ic_person));
        barangList.add(new Barang(
                "Nandar","Lampung","SIM C",R.drawable.ic_person));
        barangList.add(new Barang(
                "Nandar","Lampung","SIM C",R.drawable.ic_person));
        barangList.add(new Barang(
                "Nandar","Lampung","SIM C",R.drawable.ic_person));

        adapter = new BarangAdapter(this, barangList);
        recyclerView.setAdapter(adapter);




        //Bottom navigation
    }



}