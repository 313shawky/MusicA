package com.example.android.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
        Intent songIntent = getIntent();
        ImageView songCover = findViewById(R.id.playing_song_cover);
        songCover.setImageResource(songIntent.getIntExtra("songCover", 0));
        TextView songTitle = findViewById(R.id.playing_song_title);
        songTitle.setText(songIntent.getStringExtra("songTitle"));
        TextView artistName = findViewById(R.id.playing_artist_name);
        artistName.setText(songIntent.getStringExtra("artistName"));
    }
}
