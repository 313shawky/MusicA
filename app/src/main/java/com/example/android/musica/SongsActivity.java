package com.example.android.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Bad Guy", "Billie Eilish", R.drawable.bad_guy));
        songs.add(new Song("Con Altura (feat. El Guincho)", "J. Balvin & Rosalia", R.drawable.con_altura));
        songs.add(new Song("Sucker", "Jonas Brothers", R.drawable.sucker));
        songs.add(new Song("Señorita", "Shawn Mendes & Camila Cabello", R.drawable.seniorita));
        songs.add(new Song("Don't Start Now", "Dua Lipa", R.drawable.dont_start_now));
        songs.add(new Song("Lover", "Taylor Swift", R.drawable.lover));
        songs.add(new Song("The Greatest", "Lana Del Rey", R.drawable.the_greatest));
        songs.add(new Song("Nightmare", "Halsey", R.drawable.nightmare));
        songs.add(new Song("Lose You To Love Me", "Selena Gomez", R.drawable.lose_you_to_love_me));
        songs.add(new Song("Never Really Over", "Katy Perry", R.drawable.never_really_over));
        SongAdapter adapter = new SongAdapter(this, songs);
        final ListView listView = findViewById(R.id.songs_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = songs.get(position);
                Intent playingIntent = new Intent(SongsActivity.this, PlayingActivity.class);
                playingIntent.putExtra("songCover", song.getmSongCoverId());
                playingIntent.putExtra("songTitle", song.getmSongTitle());
                playingIntent.putExtra("artistName", song.getmArtistName());
                startActivity(playingIntent);
            }
        });
    }
}
