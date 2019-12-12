package com.example.workoutapp;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Head extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.head_workout);

        Button browser = findViewById(R.id.panicAndRunButton);
        browser.setOnClickListener(unused -> {
            // Change the label's text
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cs125.cs.illinois.edu/MP/0/"));
            startActivity(intent);
        });


    }

}