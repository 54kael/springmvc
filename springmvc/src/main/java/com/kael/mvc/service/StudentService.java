package com.kael.mvc.service;

import com.kael.mvc.beans.Student;
import com.kael.mvc.mapper.StudentMapper;
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
