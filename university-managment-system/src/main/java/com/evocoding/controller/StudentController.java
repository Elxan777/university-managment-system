package com.evocoding.controller;
import lombok.RequiredArgsConstructor;
import com.evocoding.dto.CreateStudentDTO;
import com.evocoding.dto.StudentDTO;
import com.evocoding.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    public StudentController() {
        studentService = null;
    }

    @GetMapping
    public ResponseEntity<List<StudentDTO>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(studentService.findAll());
    }

    @PostMapping
    public ResponseEntity<Void> create(@RequestBody CreateStudentDTO  createStudentDTO){
        studentService.create(createStudentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

