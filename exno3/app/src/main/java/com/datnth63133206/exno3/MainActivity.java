package com.datnth63133206.exno3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtA;
    EditText edtB;
    TextView tvResult;
    TextView math;
    TextView tvA;
    TextView tvB;
    Button btnDiv;
    Button btnMulti;
    Button btnMinus;
    Button btnAdd;
    static float result = 0;
    String info = "Vui lòng nhập đầy đủ thông tin!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchItem();
        add();
        minus();
        multi();
        div();
    }
    void add(){
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getNumber1 = edtA.getText().toString();
                String getNumber2 = edtB.getText().toString();
                if (getNumber1.isEmpty() || getNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, info, Toast.LENGTH_SHORT).show();
                    return;
                }
                float num1 = Float.parseFloat(getNumber1);
                float num2 = Float.parseFloat(getNumber2);
                float sum = num1 + num2;
                formatDataInput(num1, num2);
                math.setText("+");
                tvA.setText(String.valueOf(num1));
                tvB.setText(String.valueOf(num2));
                tvResult.setText(String.valueOf(sum));
            }
        });
    }
    void minus(){
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getNumber1 = edtA.getText().toString();
                String getNumber2 = edtB.getText().toString();
                if (getNumber1.isEmpty() || getNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, info, Toast.LENGTH_SHORT).show();
                    return;
                }
                float num1 = Float.parseFloat(getNumber1);
                float num2 = Float.parseFloat(getNumber2);
                float minus = num1 - num2;
                math.setText("-");
                tvA.setText(String.valueOf(num1));
                tvB.setText(String.valueOf(num2));
                tvReult.setText(String.valueOf(minus));
            }
        });
    }
    void multi(){
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getNumber1 = editTextNumber1.getText().toString();
                String getNumber2 = editTextNumber2.getText().toString();
                if (getNumber1.isEmpty() || getNumber2.isEmpty()){
                    Toast.makeText(MainActivity.this, info, Toast.LENGTH_SHORT).show();
                    return;
                }
                float num1 = Float.parseFloat(getNumber1);
                float num2 = Float.parseFloat(getNumber2);
                float multi = num1 * num2;
                math.setText("x");
                numb1.setText(String.valueOf(num1));
                numb2.setText(String.valueOf(num2));
                resultCalculate.setText(String.valueOf(multi));
            }
        });
    }
    void div(){
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(edtA.getText().toString());
                float b = Float.parseFloat(edtB.getText().toString());
                if (a.isEmpty() || b.isEmpty()){
                    Toast.makeText(MainActivity.this, info, Toast.LENGTH_SHORT).show();
                    return;
                }
                if(b == 0){
                    info = "Không thể chia với số 0";
                    Toast.makeText(MainActivity.this, info, Toast.LENGTH_SHORT).show();
                    return;
                }
                float divide = a / b;
                math.setText(":");
                tvA.setText(String.valueOf(a));
                tvB.setText(String.valueOf(b));
                tvResult.setText(String.valueOf(divide));
            }
        });
    }
    String mSetText(String str){
        return str;
    }
    void formatDataInput(float...num){
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
    }
    void searchItem(){
        edtA = findViewById(R.id.edtA);
        edtB = findViewById(R.id.edtB);

        tvA = findViewById(R.id.number1);
        tvB = findViewById(R.id.number2);
        math = findViewById(R.id.math);
        tvResult = findViewById(R.id.tvResult7);

        btnDivide = findViewById(R.id.btnDivide);
        btnAdd = findViewById(R.id.btnAdd);
        btnMulti = findViewById(R.id.btnMulti);
        btnMinus = findViewById(R.id.btnMinus);
    }
}
}