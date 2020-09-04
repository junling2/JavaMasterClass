package com.yamcha;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private ArrayList<Song> songs = new ArrayList<>();
    private String title;
    private String artist;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private boolean findSong(String songTitle) {
        for (Song s : songs) {
            if (s.getTitle().equals(songTitle)) {
                return true;
            }
        }
        return false;
    }
    private Song returnSong(String songTitle) {
        for (Song s : songs) {
            if (s.getTitle().equals(songTitle)) {
                return s;
            }
        }
        return null;
    }

    public boolean addSong(String title) {
        if (findSong(title)) {
            System.out.println("Song already in Album");
            return false;
        }
        songs.add(new Song(title, 3.00));
        return true;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if (index >= 0 && index < songs.size()) {
            playlist.add(songs.get(index));
            return true;
        }
        System.out.println("Track #" + trackNumber + "does not exist in album");
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        if (findSong(title)) {
            playlist.add(returnSong(title));
            return true;
        }
        System.out.println("Song was not found in this album");
        return false;
    }
}
