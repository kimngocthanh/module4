package com.example.ss7_baitap2.dto;

import com.example.ss7_baitap2.model.Song;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class SongDto implements Validator {
    private int id;
    private String name;
    private String artist;
    private String typeMusic;

    public SongDto() {
    }

    public SongDto(int id, String name, String artist, String typeMusic) {
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        SongDto songDto = (SongDto) target;
        if (songDto.getName().equals("")) {
            errors.rejectValue("name", null, "Song not empty");
        } else if (songDto.getName().length() > 800) {
            errors.rejectValue("name", null, "Do not exceed 800 characters");
        } else if (!songDto.getName().matches("^[a-zA-Z]*$")) {
            errors.rejectValue("name", null, "Does not contain special characters like @ ; , . = - + , ….");
        }

        if (songDto.getArtist().equals("")) {
            errors.rejectValue("artist", null, "Artist not empty");
        } else if (songDto.getArtist().length() > 300) {
            errors.rejectValue("artist", null, "Do not exceed 300 characters");
        } else if (!songDto.getArtist().matches("^[a-zA-Z]*$")) {
            errors.rejectValue("artist", null, "Does not contain special characters like @ ; , . = - + , ….");
        }

        if(songDto.getTypeMusic().equals("")) {
            errors.rejectValue("typeMusic",null,"Type music not empty");
        } else if (songDto.getTypeMusic().length() >= 1000) {
            errors.rejectValue("typeMusic",null,"Do not exceed 1000 characters");
        } else if (songDto.getTypeMusic().matches("^[a-zA-Z]*$")) {
            errors.rejectValue("typeMusic",null,"Does not contain special characters like @ ; . = - + , ….");
        }
    }
}
