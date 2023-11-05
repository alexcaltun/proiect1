package com.pillar.aclabs2023.controllers;

import com.pillar.aclabs2023.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/")
    public String getHomepage(){
        return homeService.getFirstString();
    }

    @GetMapping("/getFirstString")
    public String getFirstString(){
        return homeService.getFirstString();
    }

    @PostMapping("/addString")
    public void addString(@RequestBody String string){
        homeService.addString(string);
    }

    @GetMapping("/getAllStrings")
    public List<String> getAllStrings(){
        return homeService.getAllStrings();
    }

    @PutMapping("/updateString/{string}")
    public void updateString (@RequestBody String updatedString, @PathVariable String string)
    {
        homeService.updateString(updatedString, string);
    }

    @DeleteMapping("/deleteString/{string}")
    public void deleteString (@PathVariable String string)
    {
        homeService.deleteString(string);
    }

}
