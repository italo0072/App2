package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button jugar,cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugar  = (Button) findViewById(R.id.btnp);
        cerrar  = (Button) findViewById(R.id.btnl);

        jugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnjugar = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(btnjugar);

            }

        });
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
               System.exit(2);

            }

        });
    }
}