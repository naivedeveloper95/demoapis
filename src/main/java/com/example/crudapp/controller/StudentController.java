package com.example.crudapp.controller;

import com.example.crudapp.entity.StudentDetails;
import com.example.crudapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/student")
    public StudentDetails createStudent(@RequestBody StudentDetails student) {
        System.out.println(student.toString());
        return studentRepository.save(student);
    }

    @GetMapping("/student")
    public List<StudentDetails> getAllStudent() {
        return studentRepository.findAll();
    }
}
