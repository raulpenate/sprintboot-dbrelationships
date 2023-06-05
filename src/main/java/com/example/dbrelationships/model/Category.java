package com.example.dbrelationships.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;
    private String category;
}
