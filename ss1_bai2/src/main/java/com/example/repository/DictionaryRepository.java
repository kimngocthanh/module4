package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository{
    private static Map<String,String> stringMap = new HashMap<>();
    static {
        stringMap.put("blue","xanh da trời");
        stringMap.put("yellow","vàng");
        stringMap.put("red","đỏ");
        stringMap.put("green","xanh lá cây");
        stringMap.put("banana","chuối");
        stringMap.put("school","trường học");
    }
    @Override
    public String vietnamese(String english) {
//        for (String s: stringMap.keySet()) {
//            if(s.equals(english)){
//                return stringMap.get(s);
//            }
//        }
//        return null;
        return stringMap.get(english);
    }
}
