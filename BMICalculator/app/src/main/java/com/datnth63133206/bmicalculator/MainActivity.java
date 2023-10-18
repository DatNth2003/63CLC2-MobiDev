package com.datnth63133206.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText etHeight;
    EditText etWeight;
    TextView tvResultNum;
    TextView tvResultString;
    Button btnCalc;
    void findView(){
        btnCalc = findViewById(R.id.btnCalc);
        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        tvResultNum = findViewById(R.id.tvResultNum);
        tvResultString = findViewById(R.id.tvResultNum);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
    }
    public void bmiCalc(){
        String weightString = etWeight.getText().toString();
        String heightString = etHeight.getText().toString();

        if (!weightString.isEmpty() && !heightString.isEmpty()) {
            float weight = Float.parseFloat(weightString);
            float height = Float.parseFloat(heightString) / 100;
            float bmi = weight / (height * height);
            DecimalFormat df = new DecimalFormat("#.0");
            String formattedBMI = df.format(bmi);
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

            tvResultNum.setText("" + formattedBMI );
            tvResultString.setText(result.toUpperCase());
        } else {
            tvResultNum.setText("Vui lòng nhập thông tin.");
            tvResultString.setText("");
        }
    }
}