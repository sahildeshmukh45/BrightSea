package com.BrightSea.demo.Model;

import com.BrightSea.demo.Model.Subject;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String address;
    private String mobile;

    @Column(length = 500)
    private String backgroundEducation;

    @ManyToMany
    @JoinTable(
            name = "student_subject",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private List<Subject> subjects;
}
