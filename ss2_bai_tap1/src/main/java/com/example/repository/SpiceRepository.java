package com.example.repository;

import com.example.model.Spice;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SpiceRepository implements ISpiceRepository {
    private static List<Spice> spiceList = new ArrayList<>();

    static {
        spiceList.add(new Spice(1,"Lettuce"));
        spiceList.add(new Spice(2,"Tomato"));
        spiceList.add(new Spice(3,"Mustard"));
        spiceList.add(new Spice(4,"Sprouts"));
    }

    @Override
    public List<Spice> displaySpice() {
        return spiceList;
    }
}
