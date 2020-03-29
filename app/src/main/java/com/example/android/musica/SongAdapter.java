package com.example.android.musica;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Song song = getItem(position);
        if (song != null) {
            TextView songTitle = listItemView.findViewById(R.id.song_title);
            songTitle.setText(song.getmSongTitle());
            TextView artistName = listItemView.findViewById(R.id.artist_name);
            artistName.setText(song.getmArtistName());
            ImageView songCover = listItemView.findViewById(R.id.song_cover);
            songCover.setImageResource(song.getmSongCoverId());
        }
        return listItemView;
    }
}
