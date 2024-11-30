package com.BrightSea.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type; // Theory or Practical

}
