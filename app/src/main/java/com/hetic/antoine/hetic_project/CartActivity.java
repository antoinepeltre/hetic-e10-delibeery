package com.hetic.antoine.hetic_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CartActivity extends AppCompatActivity {

    Button pButton;
    Button tButton;
    Button dButton;
    Button d2Button;
    Button d5Button;
    Button d12Button;


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

        tButton = findViewById(R.id.table);
        tButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CartActivity.this, TableActivity.class);
                startActivity(intent);
            }
        });

        dButton = findViewById(R.id.button11);
        dButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CartActivity.this, panierActivity.class);
                startActivity(intent);
            }
        });


        d12Button = findViewById(R.id.button12);
        d12Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CartActivity.this, panierActivity.class);
                startActivity(intent);
            }
        });


        d2Button = findViewById(R.id.button2);
        d2Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CartActivity.this, panierActivity.class);
                startActivity(intent);
            }
        });


        d5Button = findViewById(R.id.button5);
        d5Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CartActivity.this, panierActivity.class);
                startActivity(intent);
            }
        });


    }
}
