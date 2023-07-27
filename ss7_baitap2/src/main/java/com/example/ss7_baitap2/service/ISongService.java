package com.example.ss7_baitap2.service;

import com.example.ss7_baitap2.model.Song;

import java.util.List;

public interface ISongService {
    void add(Song song);

    List<Song> display();

    Song song(int id);
}
