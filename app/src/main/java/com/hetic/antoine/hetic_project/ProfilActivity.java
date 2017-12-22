package com.hetic.antoine.hetic_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfilActivity extends AppCompatActivity {

    Button tButton;
    Button cButton;
    Button xButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        tButton = findViewById(R.id.table);
        tButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ProfilActivity.this, TableActivity.class);
                startActivity(intent);
            }
        });

        cButton = findViewById(R.id.carte);
        cButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ProfilActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        xButton = findViewById(R.id.panier);
        xButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ProfilActivity.this, CommandeActivity.class);
                startActivity(intent);
            }
        });

        ImageView myImageView = (ImageView) findViewById(R.id.imageView2);
        myImageView.setImageResource(R.drawable.profilphoto);


    }
}
