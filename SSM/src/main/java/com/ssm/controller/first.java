package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class first {
    @RequestMapping("/some.do")
    ModelAndView dosome(String name){
        name="this is "+name;
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("some");
        return mv;
    }
}
