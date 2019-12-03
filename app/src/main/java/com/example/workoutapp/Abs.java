package com.example.workoutapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Abs extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abs_workout);

        Button dumbbellCrunch = findViewById(R.id.dumbbellCrunchButton);
        dumbbellCrunch.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, DumbbellCrunch.class);
            startActivity(intent);
        });

        Button tuckAndCrunch = findViewById(R.id.tuckAndCrunchButton);
        tuckAndCrunch.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, TuckAndCrunch.class);
            startActivity(intent);
        });

        Button modifiedVsit = findViewById(R.id.modifiedVsitButton);
        modifiedVsit.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, ModifiedVsit.class);
            startActivity(intent);
        });

        Button crunch = findViewById(R.id.crunchButton);
        crunch.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Crunch.class);
            startActivity(intent);
        });

        Button hangingLegRaise = findViewById(R.id.hangingLegRaiseButton);
        hangingLegRaise.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, HangingLegRaise.class);
            startActivity(intent);
        });

        Button hangingKneeRaiseTwist = findViewById(R.id.hangingKneeRaiseTwistButton);
        hangingKneeRaiseTwist.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, HangingKneeRaiseTwist.class);
            startActivity(intent);
        });

        Button hangingKneeRaise = findViewById(R.id.hangingKneeRaiseButton);
        hangingKneeRaise.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, HangingKneeRaise.class);
            startActivity(intent);
        });

        Button garhammerRaise = findViewById(R.id.garhammerRaiseButton);
        garhammerRaise.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, GarhammerRaise.class);
            startActivity(intent);
        });

        Button declinePlankFootTouch = findViewById(R.id.plankWithFootTouchButton);
        declinePlankFootTouch.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, DeclinePlankFootTouch.class);
            startActivity(intent);
        });

        Button seatedRussianTwist = findViewById(R.id.seatedRussianTwistButton);
        seatedRussianTwist.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, SeatedRussianTwist.class);
            startActivity(intent);
        });

        Button bicycleCrunch = findViewById(R.id.bicycleCrunchButton);
        bicycleCrunch.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, BicycleCrunch.class);
            startActivity(intent);
        });

        Button plank = findViewById(R.id.plankButton);
        plank.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, Plank.class);
            startActivity(intent);
        });





    }

}