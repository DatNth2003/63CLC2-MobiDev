package com.datnth63133206.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAdd,btnSub,btnMul,btnDiv;
    EditText edtNum1, edtNum2;
    int num1,num2;
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnDiv = findViewById(R.id.btnDiv);
        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        tvResult = findViewById(R.id.tvResult);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        num1 = getIntEdt(edtNum1);
        num2 = getIntEdt(edtNum2);
        int id = v.getId();
        if(id == R.id.btnAdd){
            tvResult.setText("Result: "+(num1+num2));
        }
        else if(id == R.id.btnSub){
            tvResult.setText("Result: " + num1 + num2 +(num1-num2));
        } else if (id == R.id.btnMul) {
            tvResult.setText("Result: " + num1 + num2 +   (num1*num2));
        } else if (id == R.id.btnDiv) {
            if(num2==0) tvResult.setText("Result: Cant divide for 0!");
            else tvResult.setText("Result: "+(num1/num2));
        }
    }
    public int getIntEdt(EditText edt){
        if(edt.getText().toString().equals("")){
            Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
            return 0;
        }
        return Integer.parseInt(edt.getText().toString());
    }



}