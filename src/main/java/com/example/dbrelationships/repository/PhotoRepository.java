package com.example.dbrelationships.repository;

import com.example.dbrelationships.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepository extends CrudRepository<Photo, Long> {
}
