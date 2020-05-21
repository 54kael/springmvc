package com.kael.javassm.controller;

import com.kael.javassm.beans.Student;
import com.kael.javassm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    StudentService studentService;

    public HelloController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/hello")
    @ResponseBody
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
