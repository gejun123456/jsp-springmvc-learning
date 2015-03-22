package com.servlet;

import dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by bruce on 3/21/2015.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginDao loginDao;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(@RequestParam String name, @RequestParam String password, ModelMap model) {
        System.out.println(name+"  " + password);
        if (loginDao.login(name,password)) {
            return "loginss";
        } else {
            return "loginf";
        }
    }
}
