package com.itschool.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title", "Spring Security Hello World");
        modelAndView.addObject("message", "This is welcome page");
        modelAndView.setViewName("welcome");
        return modelAndView;
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("title", "Spring Security Hello World");
        modelAndView.addObject("message", "This is protected page");
        modelAndView.setViewName("admin");
        return modelAndView;
    }

    @RequestMapping(value = "/dba**", method = RequestMethod.GET)
    public ModelAndView dbaPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is the protected dba welcome page!");
        model.setViewName("dba");
        return model;
    }

}
