package com.BrightSea.demo.Contoller;
import com.BrightSea.demo.Model.Student;
import com.BrightSea.demo.Model.Subject;
import com.BrightSea.demo.Repository.StudentRepo;
import com.BrightSea.demo.Repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private SubjectRepo subjectRepository;

    @Autowired
    private StudentRepo studentRepository;

    @PostMapping("/subjects")
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }

    @GetMapping("/subjects")
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @PutMapping("/subjects/{id}")
    public Subject updateSubject(@PathVariable Long id, @RequestBody Subject subject) {
        subject.setId(id);
        return subjectRepository.save(subject);
    }

    @DeleteMapping("/subjects/{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectRepository.deleteById(id);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }
}
