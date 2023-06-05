package com.example.dbrelationships.service;

import com.example.dbrelationships.model.Photo;
import com.example.dbrelationships.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PhotoService {
    @Autowired
    PhotoRepository photoRepository;

    public ArrayList<Photo> getPhotos(){
        return (ArrayList<Photo>) photoRepository.findAll();
    }

    public Optional<Photo> getPhoto(Long id){
        return photoRepository.findById(id);
    }

    public Photo postPhoto(Photo photo){
        return photoRepository.save(photo);
    }
}
