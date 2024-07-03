package com.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "comment_tbl")
@Getter
@Setter
public class Commet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Ensure this matches the column name in your database

    private String name;
    private String email;

    @Lob
    private String content;

    private LocalDate createdOn;

    @ManyToOne
    @JoinColumn(name ="post_id")
    private Post post;
    
    // Getters and setters
}
