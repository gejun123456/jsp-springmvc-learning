package com.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bruce on 2/8/2015.
 */
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap model) {
        model.addAttribute("message", "Spring 5 MVC Hello World");
        return "helloworld";
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi() {
        return "hi";
    }
}
