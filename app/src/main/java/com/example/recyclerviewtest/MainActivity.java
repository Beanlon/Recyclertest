package com.example.recyclerviewtest;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;

    List<Items> itemList = new ArrayList<>();
    List<String> titles = new ArrayList<>();
    List<String> dates = new ArrayList<>();
    List<Integer> images = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillItemList();

        for (Items item : itemList) {
            titles.add(item.getTitle());
            dates.add(item.getDate());
            images.add(item.getImage());
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, titles, dates, images);
        recyclerView.setAdapter(adapter);
    }

    private void fillItemList() {
        Items i0 = new Items("Minds in Motion", "May 10,2024",R.drawable._41030218_847772100724534_5076003307943691895_n__1_);
        Items i1 = new Items("Enrollment currently ongoing", "May 13,2024",R.drawable._40096297_844122001089544_8651516815143089047_n);
        Items i2 = new Items("asdasdsafajkhdkajshdkjh", "2024-15-09",R.drawable.ic_launcher_background);


        itemList.addAll(Arrays.asList(new Items[]{i0,i1,i2}));
    }
}