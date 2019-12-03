package com.example.workoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Vibrator chestVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);

        Button chest = findViewById(R.id.chest);
        chest.setOnClickListener(unused -> {
            // Change the label's text
            chestVibrator.vibrate(500);
            Intent intent = new Intent(this, chest.class);
            startActivity(intent);
        });
        Vibrator leftShoulderVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);

        Button leftShoulder = findViewById(R.id.leftShoulder);
        leftShoulder.setOnClickListener(unused -> {
            // Change the label's text
            leftShoulderVibrator.vibrate(500);
            Intent intent = new Intent(this, shoulders.class);
            startActivity(intent);
        });
        Vibrator rightShoulderVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        Button rightShoulder = findViewById(R.id.rightShoulder);
        rightShoulder.setOnClickListener(unused -> {
            // Change the label's text
            rightShoulderVibrator.vibrate(500);
            Intent intent = new Intent(this, shoulders.class);
            startActivity(intent);
        });
        Vibrator leftBicepVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        Button leftBicep = findViewById(R.id.leftBicep);
        leftBicep.setOnClickListener(unused -> {
            // Change the label's text
            leftBicepVibrator.vibrate(500);
            Intent intent = new Intent(this, Biceps.class);
            startActivity(intent);
        });
        Vibrator rightBicepVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        Button rightBicep = findViewById(R.id.rightBicep);
        rightBicep.setOnClickListener(unused -> {
            // Change the label's text
            rightBicepVibrator.vibrate(500);
            Intent intent = new Intent(this, Biceps.class);
            startActivity(intent);
        });
        Vibrator leftForearmVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        Button leftForearm = findViewById(R.id.leftForearm);
        leftForearm.setOnClickListener(unused -> {
            // Change the label's text
            leftForearmVibrator.vibrate(500);
            Intent intent = new Intent(this, Forearm.class);
            startActivity(intent);
        });
        Vibrator rightForearmVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        Button rightForearm = findViewById(R.id.rightForearm);
        rightForearm.setOnClickListener(unused -> {
            // Change the label's text
            rightForearmVibrator.vibrate(500);
            Intent intent = new Intent(this, Forearm.class);
            startActivity(intent);
        });
        Vibrator absVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        Button abs = findViewById(R.id.abs);
        abs.setOnClickListener(unused -> {
            // Change the label's text
            absVibrator.vibrate(500);
            Intent intent = new Intent(this, Abs.class);
            startActivity(intent);
        });
        Vibrator leftQuadVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        Button leftQuad = findViewById(R.id.leftQuad);
        leftQuad.setOnClickListener(unused -> {
            // Change the label's text
            leftQuadVibrator.vibrate(500);
            Intent intent = new Intent(this, Quads.class);
            startActivity(intent);
        });
        Vibrator rightQuadVibrator = (Vibrator)getSystemService(VIBRATOR_SERVICE);
        Button rightQuad = findViewById(R.id.rightQuad);
        rightQuad.setOnClickListener(unused -> {
            // Change the label's text
            rightQuadVibrator.vibrate(500);
            Intent intent = new Intent(this, Quads.class);
            startActivity(intent);
        });


        // comment
    }
}
