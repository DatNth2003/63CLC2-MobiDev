package com.datnth63133206.bmicalculator2;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtWeight;
    EditText edtHeight;
    Button btnSubmit;
    TextView tvResultNum;
    TextView tvResultString;
    RadioGroup rgWeight;
    TextView tvCategories;
    RadioGroup rgMeasures;
    RadioButton rbStandard1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findControls();
        getCategories();
        rgWeight.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                RadioButton rb = (RadioButton)group.findViewById(checkedId);
                Toast.makeText(getBaseContext(), String.valueOf(rgWeight.getCheckedRadioButtonId()), Toast.LENGTH_SHORT).show();
            }
        });
        View.OnClickListener radiolistener = new View.OnClickListener (){
            public void onClick(View v) {
                if(v==rbStandard1){
                    Standard1Calc();
                }
            }
        };
    }
    void Standard1Calc(){
        String wStr = edtWeight.getText().toString();
        String hStr = edtWeight.getText().toString();
        if (!wStr.isEmpty() && !hStr.isEmpty()) {
            float w = Float.parseFloat(wStr);
            float h = Float.parseFloat(hStr) / 100;
            float bmi = w / (h * h);
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
            tvResultNum.setText("Your BMI: " + formattedBMI);
            tvResultString.setText(result.toUpperCase());
        } else {
            tvResultNum.setText("Vui lòng nhập thông tin.");
            tvResultString.setText("Result: ");
        }
    }
    void getCategories(){

        String defaultCat = "Underweight = <18.5\n" +
                "        Normal weight = 18.5–24.9\n" +
                "        Overweight = 25–29.9\n" +
                "        Obesity = BMI of 30 or greater";
        tvCategories.setText(defaultCat);
    }
    public void findControls(){
        edtWeight = findViewById(R.id.edtWeight);
        edtHeight = findViewById(R.id.edtHeight);
        btnSubmit = findViewById(R.id.btnSubmit);
        tvResultNum = findViewById(R.id.tvResultNum);
        tvResultString = findViewById(R.id.tvResultString);
        tvCategories = findViewById(R.id.titleCategories);
        rgMeasures = findViewById(R.id.rgMeasures);
        rbStandard1 = findViewById(R.id.rbStandard1);
    }
}
