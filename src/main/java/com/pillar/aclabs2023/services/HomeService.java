package com.pillar.aclabs2023.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pillar.aclabs2023.repositories.HomeRepository;
import java.util.List;

@Service
public class HomeService {

    @Autowired
    HomeRepository homeRepository;

    public String getFirstString() {
        return homeRepository.getFirstString();
    }

    public void addString(String string) {
        homeRepository.addString(string);
    }

    public List<String> getAllStrings() {
        return homeRepository.getAllStrings();
    }

    public void updateString(String updatedString, String string) {
        homeRepository.updateString(updatedString, string);
    }

    public void deleteString(String string) {
        homeRepository.deleteString(string);
    }
}
