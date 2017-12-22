package com.hetic.antoine.hetic_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfilActivity extends AppCompatActivity {
    Button mButton;
    Button tButton;
    Button cButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        mButton = findViewById(R.id.profil);
        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ProfilActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });

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

        ImageView myImageView = (ImageView) findViewById(R.id.imageView2);
        myImageView.setImageResource(R.drawable.profilphoto);


    }
}
