package com.datnth63133206.a63133206_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ActivityBai1 extends AppCompatActivity {
    EditText edtHeight;
    EditText edtWeight;
    TextView tvResultNum;
    TextView tvResultString;
    Button btnCalc;
    Button btnBack;

    void findControls() {
        btnCalc = findViewById(R.id.btnCalc);
        edtHeight = findViewById(R.id.edtHeight);
        edtWeight = findViewById(R.id.edtWeight);
        tvResultNum = findViewById(R.id.tvResultNum);
        tvResultString = findViewById(R.id.tvResultNum);
        btnBack = findViewById(R.id.btnBack);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        findControls();
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bmiCalc();
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMHC = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(iMHC);
            }
        });
    }

    public void bmiCalc() {
        String weightStr = edtWeight.getText().toString();
        String heightStr = edtHeight.getText().toString();

        if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
            float weight = Float.parseFloat(weightStr);
            float height = Float.parseFloat(heightStr) / 100;
            float bmi = weight / (height * height);
//            DecimalFormat df = new DecimalFormat("#.0");
//            String formattedBMI = df.format(bmi);
            tvResultNum.setText(String.valueOf(bmi));
            String result;
            if (bmi < 18.5) {
                result = "Weak";
            } else if (bmi < 24.9) {
                result = "Normal";
            } else if (bmi < 29.9) {
                result = "Fat";
            } else {
                result = "Very fat";
            }

            tvResultString.setText(result.toUpperCase());
        }
    }
}