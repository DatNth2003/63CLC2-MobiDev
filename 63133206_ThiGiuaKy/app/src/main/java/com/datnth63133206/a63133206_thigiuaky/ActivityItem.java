package com.datnth63133206.a63133206_thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityItem extends AppCompatActivity {
    TextView tvName;
    TextView tvContent;
    void findControls(){
        tvName = findViewById(R.id.tvName);
        tvName = findViewById(R.id.tvContent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        findControls();

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 8000)
            if (resultCode == RESULT_OK){
                String name = data.getStringExtra("itemName");
                String content = data.getStringExtra("itemContent");
                tvName.setText(name);
            }
        else Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
        else
            super.onActivityResult(requestCode, resultCode, data);
    }

}