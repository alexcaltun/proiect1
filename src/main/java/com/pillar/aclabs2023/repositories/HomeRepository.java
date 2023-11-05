package com.pillar.aclabs2023.repositories;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class HomeRepository {

    List<String> list = new ArrayList<>();

    public HomeRepository(){
        list.add("Hello World!");
        list.add("lmao");
    }

    public String getFirstString() {
        return list.get(0);
    }

    public void addString(String string) {
        list.add(string);
    }

    public List<String> getAllStrings() {
        return list;
    }

    public void updateString(String updatedString, String string) {
        Collections.replaceAll(list,string, updatedString);

    }

    public void deleteString(String string) {
        while(list.contains(string))
            list.remove(string);
    }
}
