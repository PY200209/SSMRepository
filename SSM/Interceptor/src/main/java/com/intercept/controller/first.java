package com.intercept.controller;

import com.intercept.domain.login;
import com.intercept.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class first {
    @Autowired
    private service service;
    @RequestMapping("/some.do")
    ModelAndView dosome(login login){
        boolean result = service.login(login);
        ModelAndView mv = new ModelAndView();
        if (result==true){
            mv.setViewName("true");
        }else {
            mv.setViewName("false");
        }

        return mv;
    }
}
