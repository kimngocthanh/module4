package com.example.ss7_baitap2.service;

import com.example.ss7_baitap2.model.Song;
import com.example.ss7_baitap2.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService{
    @Autowired
    private ISongRepository songRepository;
    @Override
    public void add(Song song) {
        songRepository.save(song);
    }

    @Override
    public List<Song> display() {
        return songRepository.findAll();
    }

    @Override
    public Song song(int id) {
        return songRepository.findById(id).get();
    }
}
