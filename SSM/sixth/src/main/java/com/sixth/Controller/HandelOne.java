package com.sixth.Controller;

import com.sixth.domain.login;
import com.sixth.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HandelOne {
    @Autowired
    private service service;
    @RequestMapping("login.do")
    ModelAndView login(login login){
        boolean result = service.login(login);
        ModelAndView mv = new ModelAndView();
        if(result){
            mv.setViewName("true");
        }else {
            mv.setViewName("false");
        }
        return mv;
    }
}
