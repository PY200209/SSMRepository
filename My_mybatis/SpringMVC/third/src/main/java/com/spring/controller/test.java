package com.spring.controller;

import com.spring.vo.login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test {
    @RequestMapping("test.do")
    ModelAndView dotest(String name){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",name);
        mv.setViewName("test");
        return mv;
    }
    @RequestMapping(value = {"one.do","two.do"},method = RequestMethod.POST)
    ModelAndView donums(@RequestParam("age") Integer nums){
        nums=nums+10;
        ModelAndView mv = new ModelAndView();
        mv.addObject("age",nums);
        mv.setViewName("nums");
        return mv;
    }
    @RequestMapping("object.do")
    ModelAndView doobject(login login){
        ModelAndView mv = new ModelAndView();
        mv.addObject("login",login);
        mv.setViewName("object");
        return mv;
    }
}
