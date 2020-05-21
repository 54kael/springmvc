package com.kael.mvc.controller;

import com.kael.mvc.beans.Student;
import com.kael.mvc.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    StudentService studentService;

    public HelloController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/student")
    public ModelAndView student(){
        Student student = studentService.getStudentById(1);
        ModelAndView mv = new ModelAndView();
        mv.addObject(student);
        mv.setViewName("student");
        return mv;
    }
}
