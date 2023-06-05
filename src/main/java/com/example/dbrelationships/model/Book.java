package com.example.dbrelationships.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
public class Book {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "book_id")
   private Long id ;
   private String name;
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "fk_photo_id")
   //@JsonIgnore
   private Photo photo;
}
