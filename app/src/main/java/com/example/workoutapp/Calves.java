package com.example.workoutapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Calves extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calves_workout);

        Button dumbbellCrunch = findViewById(R.id.raisedCalfRaiseButton);
        dumbbellCrunch.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, RaisedCalfRaise.class);
            startActivity(intent);
        });

        Button bentKneeCalfRaise = findViewById(R.id.bentKneeCalfRaiseButton);
        bentKneeCalfRaise.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, BentKneeCalfRaise.class);
            startActivity(intent);
        });

        Button seatedCalfRaise = findViewById(R.id.seatedCalfRaiseButton);
        seatedCalfRaise.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, SeatedCalfRaise.class);
            startActivity(intent);
        });

        Button singleLegCalfRaise = findViewById(R.id.singleLegCalfRaiseButton);
        singleLegCalfRaise.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, SingleLegCalfRaise.class);
            startActivity(intent);
        });

        Button calf = findViewById(R.id.calfPressButton);
        calf.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, CalfPress.class);
            startActivity(intent);
        });



    }

}