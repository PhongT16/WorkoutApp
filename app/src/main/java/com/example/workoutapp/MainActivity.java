package com.example.workoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button chest = findViewById(R.id.chest);
        chest.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, chest.class);
            startActivity(intent);
        });

        Button leftShoulder = findViewById(R.id.leftShoulder);
        leftShoulder.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, shoulders.class);
            startActivity(intent);
        });

        Button rightShoulder = findViewById(R.id.rightShoulder);
        rightShoulder.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, shoulders.class);
            startActivity(intent);
        });

        Button leftBicep = findViewById(R.id.leftBicep);
        leftBicep.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Biceps.class);
            startActivity(intent);
        });

        Button rightBicep = findViewById(R.id.rightBicep);
        rightBicep.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Biceps.class);
            startActivity(intent);
        });

        Button leftForearm = findViewById(R.id.leftForearm);
        leftForearm.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Forearm.class);
            startActivity(intent);
        });

        Button rightForearm = findViewById(R.id.rightForearm);
        rightForearm.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Forearm.class);
            startActivity(intent);
        });

        Button abs = findViewById(R.id.abs);
        abs.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Abs.class);
            startActivity(intent);
        });

        Button leftQuads = findViewById(R.id.leftQuad);
        leftQuads.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Quads.class);
            startActivity(intent);
        });

        Button rightQuads = findViewById(R.id.rightQuad);
        rightQuads.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Quads.class);
            startActivity(intent);
        });


        // comment
    }
}
