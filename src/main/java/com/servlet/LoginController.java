package com.servlet;

import dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bruce on 3/21/2015.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginDao loginDao;
    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap model) {

        if(loginDao.login()) {
            return "loginss";
        } else {
            return "loginf";
        }
    }
}
