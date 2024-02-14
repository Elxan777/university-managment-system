package com.evocoding.service;

import com.evocoding.dto.CreateStudentDTO;
import com.evocoding.dto.StudentDTO;
import com.evocoding.mapper.StudentMapper;
import com.evocoding.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;


    public List<StudentDTO> findAll() {
        var studentEntities = studentRepository.findAll();
        return studentMapper.toStudentDTOList(studentEntities);
    }

    public void create(CreateStudentDTO createStudentDTO) {
        studentRepository.save(studentMapper.toStudentEntity(createStudentDTO));
    }
}