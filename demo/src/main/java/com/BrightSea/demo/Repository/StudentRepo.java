package com.BrightSea.demo.Repository;

import com.BrightSea.demo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student, Long> {
}
