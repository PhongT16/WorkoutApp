package com.example.workoutapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Forearm extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forearm_workout);

        Button cableWristCurl = findViewById(R.id.cableWristCurlButton);
        cableWristCurl.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, CableWristCurl.class);
            startActivity(intent);
        });


    }

}