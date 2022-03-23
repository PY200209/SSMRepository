package com.myjsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.myjsp.service.service;
@Controller
public class MyTest {
    @RequestMapping(value = "/some.do")
    public ModelAndView get(){
        ModelAndView mv = new ModelAndView();
        int x=10;
        mv.addObject("x",x);
        mv.setViewName("/view.jsp");
        return mv;
    }

}
