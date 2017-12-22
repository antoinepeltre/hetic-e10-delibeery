package com.hetic.antoine.hetic_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableActivity extends AppCompatActivity {

    Button pButton;
    Button cButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        pButton = findViewById(R.id.table);
        pButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(TableActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        cButton = findViewById(R.id.carte);
        cButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(TableActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }
}
