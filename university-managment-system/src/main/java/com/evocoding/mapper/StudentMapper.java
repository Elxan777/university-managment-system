package com.evocoding.mapper;

import com.evocoding.dto.CreateStudentDTO;
import com.evocoding.dto.StudentDTO;
import com.evocoding.repository.entity.StudentEntity;

import java.util.List;
@Mapper(componentModel = "String")
public interface StudentMapper {
    List<StudentDTO> toStudentDTOList(List<StudentEntity> studentEntities);
    StudentEntity toStudentEntity(CreateStudentDTO createStudentDTO);
}

