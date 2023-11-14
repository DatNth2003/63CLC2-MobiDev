package com.datnth63133206.a63133206_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnB1;
    Button btnB2;
    Button btnB3;
    Button btnB4;
    void findControls(){
        btnB1 = findViewById(R.id.btnB1);
        btnB2 = findViewById(R.id.btnB2);
        btnB3 = findViewById(R.id.btnB3);
        btnB4 = findViewById(R.id.btnB4);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();
        btnB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMHBai1 = new Intent(getApplicationContext(), ActivityBai1.class);
                startActivity(iMHBai1);
            }
        });
        btnB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMHBai2 = new Intent(getApplicationContext(), ActivityBai2.class);
                startActivity(iMHBai2);
            }
        });
        btnB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMHBai3 = new Intent(getApplicationContext(), ActivityBai3.class);
                startActivity(iMHBai3);
            }
        });
        btnB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMHBai4 = new Intent(getApplicationContext(), ActivityBai4.class);
                startActivity(iMHBai4);
            }
        });
    }
}