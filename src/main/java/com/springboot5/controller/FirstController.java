package com.springboot5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping("/demo1")
    public ModelAndView first() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("demo1");
        mv.addObject("object", new Object());
        return mv;
    }
}
