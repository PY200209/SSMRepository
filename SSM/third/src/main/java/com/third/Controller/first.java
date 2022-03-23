package com.third.Controller;

import com.third.domain.login;
import com.third.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class first {
    @Autowired
    private com.third.service.service service;
    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    ModelAndView login(login login){
        ModelAndView mv=new ModelAndView();
        boolean result = service.login(login);
        if(result){
            mv.setViewName("true");
        }else {
            mv.setViewName("false");
        }
        return mv;
    }
    @RequestMapping("/register.do")
    ModelAndView register(login login){
        ModelAndView mv=new ModelAndView();
        int result = service.register(login);
        if(result==1){
            mv.setViewName("true");
        }else {
            mv.setViewName("false");
        }
        return mv;
    }
    @RequestMapping("/update.do")
    ModelAndView update(login login){
        ModelAndView mv = new ModelAndView();
        int result = service.update(login);
        if(result==1){
            mv.setViewName("true");
        }else {
            mv.setViewName("false");
        }
        return mv;
    }
    @RequestMapping("/delete.do")
    ModelAndView delete(login login){
        ModelAndView mv = new ModelAndView();
        int result = service.delete(login);
        if(result==1){
            mv.setViewName("true");
        }else {
            mv.setViewName("false");
        }
        return mv;
    }

}
