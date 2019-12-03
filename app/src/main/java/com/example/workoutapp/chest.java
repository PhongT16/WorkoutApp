package com.example.workoutapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class chest extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chest_workout);

        Button benchPress = findViewById(R.id.benchPressButton);
        benchPress.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, benchPress.class);
            startActivity(intent);
        });

        Button dumbellBenchPress = findViewById(R.id.dumbellBenchPressButton);
        dumbellBenchPress.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, dumbellBenchPress.class);
            startActivity(intent);
        });

        Button chestPress = findViewById(R.id.chestPressButton);
        chestPress.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, chestPress.class);
            startActivity(intent);
        });

        Button dumbBellFly = findViewById(R.id.dumbBellFLyButton);
        dumbBellFly.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, dumbBellFly.class);
            startActivity(intent);
        });

        Button cableCrossover = findViewById(R.id.cableCrossoverButton);
        cableCrossover.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, cableCrossover.class);
            startActivity(intent);
        });

        Button dip = findViewById(R.id.dipButton);
        dip.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, dip.class);
            startActivity(intent);
        });




    }

}