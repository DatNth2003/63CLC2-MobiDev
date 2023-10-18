package com.datnth63133206.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnHello_click(View v){
        String strThongBao = "Hello world";
        Toast.makeText(this,strThongBao,Toast.LENGTH_LONG).show();
    }
    public void btnName_click(View v){
        EditText etName = findViewById(R.id.etName);
        String strThongBao = "Hello! Nice to see you,\n" + etName.getText()+"!";
        Toast.makeText(this,strThongBao,Toast.LENGTH_LONG).show();
    }
    public void btnHelloMyself_click(View v){
        String strThongBao = "Hello Ngo Thanh Dat!";
        Toast.makeText(this,strThongBao,Toast.LENGTH_LONG).show();
    }
}