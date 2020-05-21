package com.kael.javassm.service;

import com.kael.javassm.beans.Student;
import com.kael.javassm.mapper.StudentMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    StudentMapper studentMapper;

    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public Student getStudentById(int id) {
        return studentMapper.selectStudentById(id);
    }
}
