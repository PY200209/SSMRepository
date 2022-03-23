package com.second.controller;

import com.second.vo.second;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class first {
    @RequestMapping("/easy.do")
    ModelAndView doeasy(){
        String conversation = "this is a easy conversation";
        ModelAndView mv=new ModelAndView();
        mv.addObject("conversation",conversation);
        mv.setViewName("easy");
        return mv;
    }
    @RequestMapping(value = {"/one.do"},method = RequestMethod.POST)
    ModelAndView doone(Integer age){
        age=age*100;
        ModelAndView mv = new ModelAndView();
        mv.addObject("age",age);
        mv.setViewName("one");
        return  mv;
    }
    @RequestMapping("/two.do") 
    ModelAndView dotwo(@RequestParam("user") Integer id, @RequestParam("password") Integer key){
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",id);
        mv.addObject("password",key);
        mv.setViewName("two");
        return mv;
    }
    @RequestMapping("/object.do")
    ModelAndView doobject(second second){
        ModelAndView mv = new ModelAndView();
        mv.addObject("object",second);
        mv.setViewName("object");
        return mv;
    }
}
