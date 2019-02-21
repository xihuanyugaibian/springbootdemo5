package com.springboot5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping("/first")
    public ModelAndView first() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("first");
        mv.addObject("object", new Object());
        return mv;
    }
}
