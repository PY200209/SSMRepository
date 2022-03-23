package com.myjsp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
@Service("service")
public class service {
    public  ModelAndView dosome(){
        ModelAndView mv= new ModelAndView();
        int x =10;
        mv.addObject("x",10);
        mv.setViewName("/view.jsp");
        return mv;
    }
}
