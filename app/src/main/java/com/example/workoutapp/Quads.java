package com.example.workoutapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Quads extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quad_workout);

        Button barbellSquat = findViewById(R.id.barbellSquatButton);
        barbellSquat.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, BarbellSquat.class);
            startActivity(intent);
        });

        Button frontSquat = findViewById(R.id.frontSquatButton);
        frontSquat.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, FrontSquat.class);
            startActivity(intent);
        });

        Button boxSquat = findViewById(R.id.boxSquatButton);
        boxSquat.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, BoxSquat.class);
            startActivity(intent);
        });

        Button deadlift = findViewById(R.id.deadliftButton);
        deadlift.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Deadlift.class);
            startActivity(intent);
        });

        Button LegPress = findViewById(R.id.legPressButton);
        LegPress.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, LegPress.class);
            startActivity(intent);
        });

        Button hamstringCurl = findViewById(R.id.hamstringCurlButton);
        hamstringCurl.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, HamstringCurl.class);
            startActivity(intent);
        });

        Button seatedLegExtension = findViewById(R.id.seatedLegExtensionButton);
        seatedLegExtension.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, SeatedLegExtension.class);
            startActivity(intent);
        });

        Button dumbbellLunge = findViewById(R.id.dumbbellLungeButton);
        dumbbellLunge.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, DumbbellLunge.class);
            startActivity(intent);
        });

        Button dumbbellSquat = findViewById(R.id.dumbbellSquatButton);
        dumbbellSquat.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, DumbbellSquat.class);
            startActivity(intent);
        });





    }

}