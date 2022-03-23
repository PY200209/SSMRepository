package com.first.controller;

import com.first.vo.out;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class first {
    @RequestMapping(value = "/get.do")
    ModelAndView doget(String name){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("get");
        return mv;
    }
    @RequestMapping(value = {"/cal.do"})
    ModelAndView docal(@RequestParam("nums") Integer age){
        ModelAndView mv = new ModelAndView();
        age = 10*age;
        mv.addObject("age",age);
        mv.setViewName("cal");
        return  mv;
    }
    @RequestMapping(value = "/out.do")
    ModelAndView doout(out out){
        ModelAndView mv = new ModelAndView();
        mv.addObject("out",out);
        mv.setViewName("out");
        return mv;
    }
}
