package com.kael.javassm.mapper;

import com.kael.javassm.beans.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    Student selectStudentById(@Param("id") int id);
}
