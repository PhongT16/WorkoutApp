package com.example.workoutapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Biceps extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biceps_workout);

        Button barbellShoulderPress = findViewById(R.id.dumbbellCurlButton);
        barbellShoulderPress.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, DumbbellCurl.class);
            startActivity(intent);
        });

        Button seatedDumbbellBicepCurl = findViewById(R.id.seatedBicepCurlsButton);
        seatedDumbbellBicepCurl.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, SeatedDumbbellBicepCurls.class);
            startActivity(intent);
        });

        Button barbellCurl = findViewById(R.id.barbellCurlButton);
        barbellCurl.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, BarbellCurls.class);
            startActivity(intent);
        });

        Button concentrationCurl = findViewById(R.id.concentrationCurlButton);
        concentrationCurl.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, ConcentrationCurl.class);
            startActivity(intent);
        });

        Button hammerCurl = findViewById(R.id.hammerCurlButton);
        hammerCurl.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, HammerCurl.class);
            startActivity(intent);
        });

        Button preacherCurl = findViewById(R.id.preacherCurlButton);
        preacherCurl.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, PreacherCurl.class);
            startActivity(intent);
        });

        Button CableCurl = findViewById(R.id.cableCurlButton);
        CableCurl.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, CableCurl.class);
            startActivity(intent);
        });

        Button chinUp = findViewById(R.id.chinUpButton);
        chinUp.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, ChinUp.class);
            startActivity(intent);
        });










    }

}