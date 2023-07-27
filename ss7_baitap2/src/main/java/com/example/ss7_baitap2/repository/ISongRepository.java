package com.example.ss7_baitap2.repository;

import com.example.ss7_baitap2.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song,Integer> {
}
