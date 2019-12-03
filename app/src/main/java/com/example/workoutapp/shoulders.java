package com.example.workoutapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class shoulders extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoulders_workout);

        Button barbellShoulderPress = findViewById(R.id.barbellShoulderPressButton);
        barbellShoulderPress.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, BarbellShoulderPress.class);
            startActivity(intent);
        });

        Button dumbbellShoulderPress = findViewById(R.id.dumbbellShoulderPressButton);
        dumbbellShoulderPress.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, DumbbellShoulderPress.class);
            startActivity(intent);
        });

        Button machineShoulderPress = findViewById(R.id.machineShoulderPressButton);
        machineShoulderPress.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, MachineShoulderPress.class);
            startActivity(intent);
        });

        Button kettlebellPress = findViewById(R.id.kettlebellPressButton);
        kettlebellPress.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, KettlebellPress.class);
            startActivity(intent);
        });

        Button dumbbellRaise = findViewById(R.id.dumbbellRaiseButton);
        dumbbellRaise.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, DumbbellRaise.class);
            startActivity(intent);
        });

        Button dumbellReverseFly = findViewById(R.id.dumbbellReverseFlyButton);
        dumbellReverseFly.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, DumbbellReverseFly.class);
            startActivity(intent);
        });

        Button reverseCableFly = findViewById(R.id.reverseCableFlyButton);
        reverseCableFly.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, ReverseCableFly.class);
            startActivity(intent);
        });

        Button barbellHighPull = findViewById(R.id.barbellHighPullButton);
        barbellHighPull.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, BarbellHighPull.class);
            startActivity(intent);
        });

        Button cableRotation = findViewById(R.id.cableRotationButton);
        cableRotation.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, CableRotation.class);
            startActivity(intent);
        });

        Button facePull = findViewById(R.id.facePullButton);
        facePull.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, FacePull.class);
            startActivity(intent);
        });






    }

}