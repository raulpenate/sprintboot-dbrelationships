package com.example.dbrelationships.controller;

import com.example.dbrelationships.model.Photo;
import com.example.dbrelationships.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/photo")
public class PhotoController {
    @Autowired
    PhotoService photoService;

    @GetMapping
    public ArrayList<Photo> getPhotos(){
        return photoService.getPhotos();
    }

    @GetMapping("/{id}")
    public Optional<Photo> getPhoto(@PathVariable Long id){
        return photoService.getPhoto(id);
    }

    @PostMapping
    public Photo postPhoto(@RequestBody Photo photo){
        return photoService.postPhoto(photo);
    }
}
