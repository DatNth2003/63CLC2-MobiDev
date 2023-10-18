package com.datnth63133206.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoQuocGia;
    static final String[] dsQuocGia = new String[] {
            "Australia", "England", "Vietnam", "Albania", "USA", "Algeria"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControl();
        ArrayAdapter<String> adapterQG = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line,
                dsQuocGia);
        autoQuocGia.setAdapter(adapterQG);
    }
    void findControl(){
        autoQuocGia = (AutoCompleteTextView) findViewById(R.id.autoQuocGia);
    }
}