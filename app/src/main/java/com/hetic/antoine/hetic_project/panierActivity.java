package com.hetic.antoine.hetic_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class panierActivity extends AppCompatActivity {
    Button pButton;
    Button tButton;
    Button cButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panier);

        pButton = findViewById(R.id.profil);
        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(panierActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        tButton = findViewById(R.id.table);
        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(panierActivity.this, TableActivity.class);
                startActivity(intent);

            }
        });

        cButton = findViewById(R.id.carte);
        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(panierActivity.this, CartActivity.class);
                startActivity(intent);

            }
        });
    }
}
