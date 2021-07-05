package com.example.uncorrupt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    public ImageButton imgbtn;
    public ImageButton imgbtn2;
    public ImageButton imgbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bribery(View view){
        Intent intent = new Intent(this, Bribery.class);
        ImageButton imgbtn = findViewById(R.id.imgbtn1);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });

    }

    public void Embezzlement(View view){
        Intent intent1 = new Intent(this, Embezzlement.class);
        imgbtn2 = findViewById(R.id.imgbtn2);
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startActivity(intent1);
            }
        });
    }

    public void Networking(View view){
        Intent intent2 = new Intent(this, Networking.class);
        imgbtn3 = findViewById(R.id.imgbtn3);
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });
    }






}




























