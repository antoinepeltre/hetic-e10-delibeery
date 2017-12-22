package com.hetic.antoine.hetic_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CartActivity extends AppCompatActivity {

    Button pButton;
    Button tButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        pButton = findViewById(R.id.profil);
        pButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CartActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        pButton = findViewById(R.id.table);
        pButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CartActivity.this, TableActivity.class);
                startActivity(intent);
            }
        });


    }
}
