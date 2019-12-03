package com.example.workoutapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Hamstring extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quad_workout);

        Button hamstringCurl = findViewById(R.id.hamstringCurlButton);
        hamstringCurl.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(this, HamstringCurl.class);
            startActivity(intent);
        });



    }

}