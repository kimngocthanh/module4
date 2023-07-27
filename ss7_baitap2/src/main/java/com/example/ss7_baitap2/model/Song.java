package com.example.ss7_baitap2.model;

public class Song {
    private int id;
    private String name;
    private String artist;
    private String typeMusic;

    public Song() {
    }

    public Song(int id, String name, String artist, String typeMusic) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.typeMusic = typeMusic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTypeMusic() {
        return typeMusic;
    }

    public void setTypeMusic(String typeMusic) {
        this.typeMusic = typeMusic;
    }
}
