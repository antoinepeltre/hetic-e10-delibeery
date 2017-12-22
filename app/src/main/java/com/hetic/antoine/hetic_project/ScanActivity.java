package com.hetic.antoine.hetic_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ScanActivity extends AppCompatActivity implements View.OnClickListener {

    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scan);
        mButton = findViewById(R.id.buttonProfil);

        mButton.setOnClickListener(new View.OnClickListener(){
         @Override
            public void onClick(View view){
             Intent intent = new Intent(ScanActivity.this, TableActivity.class);
             startActivity(intent);
         }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
