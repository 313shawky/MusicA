package com.example.android.musica;

public class Song {
    private String mSongTitle;
    private String mArtistName;
    private int mSongCoverId;

    public Song(String songTitle, String artistName, int songCoverId) {
        mSongTitle = songTitle;
        mArtistName = artistName;
        mSongCoverId = songCoverId;
    }

    public String getmSongTitle() {
        return mSongTitle;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public int getmSongCoverId() {
        return mSongCoverId;
    }
}
