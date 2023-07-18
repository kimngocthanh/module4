package com.example.service;

import com.example.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService{
    @Autowired
    private IDictionaryRepository dictionaryRepository;
    @Override
    public String vietnamese(String english) {
        String vietnamese = dictionaryRepository.vietnamese(english);
        if(vietnamese != null){
            return vietnamese;
        }
        return "Ko có trong từ điển";
    }
}
