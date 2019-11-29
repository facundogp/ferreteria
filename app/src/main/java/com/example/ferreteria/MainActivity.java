package com.example.ferreteria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button buttonOne = findViewById(R.id.button2);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity2Intent = new Intent(MainActivity.this, cargar.class);
                startActivity(activity2Intent);
            }
        });


    }
}
