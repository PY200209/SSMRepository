package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping(value = "/service")
public class thirdWithParam {
    @RequestMapping(value = "/some.do",method = RequestMethod.POST)
    public ModelAndView dosome(HttpServletRequest req,String name) throws UnsupportedEncodingException {
        ModelAndView mv=new ModelAndView();
        req.setCharacterEncoding("utf-8");
        mv.addObject("name",name);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping(value = "/cal",method = RequestMethod.POST)
    ModelAndView cal(@RequestParam(value = "age",required = false) Integer age){
        age = age -10;
        ModelAndView mv = new ModelAndView();
        mv.addObject("age",age);
        mv.setViewName("cal");
        return mv;
    }
}
