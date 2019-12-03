package com.example.workoutapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ConcentrationCurl extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.concentration_curl_workout);

        playButton = (Button) findViewById(R.id.playButton);
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlayer);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("Jvj2wV0vOYU");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                System.out.print("Failed to initialize");
            }
        };

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mYoutubePlayerView.initialize(YoutubeConfig.getApiKey(), mOnInitializedListener);
            }
        });





    }
}
