package com.yamcha;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here
        Album coolAlbum = new Album("red lotus", "lisa");
        coolAlbum.addSong("fiction");
        coolAlbum.addSong("shock");
        coolAlbum.addSong("clock strikes");
        coolAlbum.addSong("we are");

        Album splash = new Album("splash", "flow");
        splash.addSong("go");
        splash.addSong("dreamers");
        splash.addSong("silhouette");

        albums.add(coolAlbum);
        albums.add(splash);

        LinkedList<Song> playlist = new LinkedList<>();

        albums.get(0).addToPlayList("shock", playlist);
        albums.get(1).addToPlayList(2, playlist);
        albums.get(0).addToPlayList(1, playlist);

        play(playlist);


    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator iterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + iterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0: // exit
                    System.out.println("exiting playlist");
                    quit = true;
                    break;
                case 1: // go to next song
                    if (!forward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }

                    if (iterator.hasNext()) {
                        System.out.println("Now Playing: " + iterator.next().toString());
                    } else {
                        System.out.println("reached end of playlist");
                        forward = false;
                    }
                    break;
                case 2: // go to previous song
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        forward = false;
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Now Playing: " + iterator.previous().toString());
                    } else {
                        System.out.println("reached start of playlist");
                        forward = true;
                    }
                    break;
                case 3:


            }
        }
    }
}
