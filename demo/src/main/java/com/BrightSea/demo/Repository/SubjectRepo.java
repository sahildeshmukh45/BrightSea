package com.BrightSea.demo.Repository;

import com.BrightSea.demo.Model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Long> {
}
