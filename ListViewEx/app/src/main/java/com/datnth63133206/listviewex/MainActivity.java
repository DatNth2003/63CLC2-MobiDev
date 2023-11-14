package com.datnth63133206.listviewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBaiHat;
    ArrayList<String> dsBaiHat;

    public void findControls(){
        lvBaiHat = findViewById(R.id.lvBaiHat);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();
        dsBaiHat = new ArrayList<>();
        dsBaiHat.add("Tiến quân ca");
        dsBaiHat.add("Đoàn ca");
        ArrayAdapter<String> adapterBaiHat;

        adapterBaiHat = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dsBaiHat);
        lvBaiHat.setAdapter(adapterBaiHat);
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                //String itemSelected = adapterBaiHat.getItem(i);
                String itemSelected = dsBaiHat.get(i);
                //thông báo lên mh
                String thongBao = "Đã chọn bài " + itemSelected + "!";
                Toast.makeText(MainActivity.this, thongBao, Toast.LENGTH_SHORT).show();
            }
        });
    }
}