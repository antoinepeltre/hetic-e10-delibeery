package com.hetic.antoine.hetic_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CommandeActivity extends AppCompatActivity {
    Button mButton;
    Button tButton;
    Button cButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commande);

        mButton = findViewById(R.id.profil);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CommandeActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

        tButton = findViewById(R.id.table);
        tButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CommandeActivity.this, TableActivity.class);
                startActivity(intent);
            }
        });

        cButton = findViewById(R.id.carte);
        cButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(CommandeActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }
}
