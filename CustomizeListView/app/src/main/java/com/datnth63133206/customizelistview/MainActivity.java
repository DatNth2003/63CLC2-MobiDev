package com.datnth63133206.customizelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Country> dsQuocGia;
        dsQuocGia = new ArrayList<>();
        Country nation1 = new Country("Viet nam", "vn", 2000000);
        Country nation2 = new Country("My", "us", 10000000);
        dsQuocGia.add(nation1);
        dsQuocGia.add(nation2);
        ListView lvQuocGia = findViewById(R.id.lvNation);
        CountryAdapter adapter = new CountryAdapter(dsQuocGia, this);
        lvQuocGia.setAdapter(adapter);

    }
}