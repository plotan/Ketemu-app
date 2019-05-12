package com.example.ketemu;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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