package com.kael.javaconfigssm.controller;

import com.kael.javaconfigssm.beans.User;
import com.kael.javaconfigssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","你好！");
        mv.setViewName("user");
        return mv;
    }

    @RequestMapping("/user")
    public ModelAndView getUser(){
        ModelAndView mv = new ModelAndView();
        User user = userService.getUserById(1);
        mv.setViewName("user");
        mv.addObject(user);
        return mv;
    }
}
