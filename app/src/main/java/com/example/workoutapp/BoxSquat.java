package com.example.workoutapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class BoxSquat extends YouTubeBaseActivity {

    YouTubePlayerView mYoutubePlayerView;
    Button playButton;
    YouTubePlayer.OnInitializedListener mOnInitializedListener;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.box_squat_workout);

        playButton = (Button) findViewById(R.id.playButton);
        mYoutubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlayer);

        mOnInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("nBc_2Jyp3tM");
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
