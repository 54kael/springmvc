package com.kael.mvc.mapper;

import com.kael.mvc.beans.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    Student selectStudentById(@Param("id") int id);
}
