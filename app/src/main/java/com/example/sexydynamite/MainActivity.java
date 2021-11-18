package com.example.sexydynamite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carmera_certification);

        /*Button imageButton1 =(Button) findViewById(R.id.btn1);
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), cameraActivity.class);
                startActivity(intent);
            }
        });*/

        Button imageButton2 =(Button) findViewById(R.id.btn2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), listActivity.class);
                startActivity(intent);
            }
        });

        Button imageButton3 =(Button) findViewById(R.id.btn3);
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), gameActivity.class);
                startActivity(intent);
            }
        });

        Button imageButton4 =(Button) findViewById(R.id.btn4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), exActivity.class);
                startActivity(intent);
            }
        });
    }

}