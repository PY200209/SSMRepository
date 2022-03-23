package com.springmvc.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class first {
    @RequestMapping(value = "/some.do")
    public ModelAndView dosome(){
        ModelAndView mv=new ModelAndView();
        int x =10;
        mv.addObject("x",x);
        mv.setViewName("myview");
        return mv;
    }
    @RequestMapping(value = "/get.do")
    public ModelAndView doget(){
        ModelAndView mv=new ModelAndView();
        String y="this is the result of the request from get.do ";
        mv.addObject("y",y);
        mv.setViewName("view2");
        return mv;
    }
    @RequestMapping(value = "/watch.do")
      ModelAndView dowatch(){
        ModelAndView mv=new ModelAndView();
        String watch="this is watch.do";
        mv.addObject("watch",watch);
        mv.setViewName("watch");
        return mv;
    }
}
