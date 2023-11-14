package com.datnth63133206.a63133206_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ActivityBai3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        setContentView(R.layout.activity_main);
        ArrayList<Country> dsQuocGia;
        dsQuocGia = new ArrayList<>();
        Country nation1 = new Country("Việt nam", "vn", 2000000);
        Country nation2 = new Country("Mỹ", "us", 10000000);
        Country nation3 = new Country("Nga", "ru", 100000);
        dsQuocGia.add(nation1);
        dsQuocGia.add(nation2);
        dsQuocGia.add(nation3);
        ListView lvQuocGia = findViewById(R.id.lvNation);
        CountryAdapter adapter = new CountryAdapter(dsQuocGia, this);
        lvQuocGia.setAdapter(adapter);

    }

}