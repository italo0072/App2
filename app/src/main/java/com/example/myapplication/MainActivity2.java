package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    Button a,b,c,d,e,f,g,j,k,l,m,volver;
    MediaPlayer a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        a = (Button) findViewById(R.id.btn1);
        b = (Button) findViewById(R.id.btn2);
        c = (Button) findViewById(R.id.btn3);
        d = (Button) findViewById(R.id.btn4);
        e = (Button) findViewById(R.id.btn5);
        f= (Button) findViewById(R.id.btn6);
        j = (Button) findViewById(R.id.btn7);
        k = (Button) findViewById(R.id.btn8);
        l = (Button) findViewById(R.id.btn9);
        m = (Button) findViewById(R.id.btn10);

        volver = (Button) findViewById(R.id.btn11);

        a1 = MediaPlayer.create(this, R.raw.n1);
        a2 = MediaPlayer.create(this, R.raw.n2);
        a3 = MediaPlayer.create(this, R.raw.n3);
        a4 = MediaPlayer.create(this, R.raw.n4);
        a5 = MediaPlayer.create(this, R.raw.n5);
        a6 = MediaPlayer.create(this, R.raw.n6);
        a7 = MediaPlayer.create(this, R.raw.n7);
        a8 = MediaPlayer.create(this, R.raw.n8);
        a9 = MediaPlayer.create(this, R.raw.n9);
        a10 = MediaPlayer.create(this, R.raw.n10);




        volver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                finish();
                System.exit(0);

            }

        });

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1.start();

            }

        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a2.start();

            }

        });  c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a3.start();

            }

        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a4.start();

            }

        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a5.start();

            }

        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a6.start();

            }

        });
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a7.start();

            }

        });
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a8.start();

            }

        });
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a9.start();

            }

        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a10.start();

            }

        });
    }
}