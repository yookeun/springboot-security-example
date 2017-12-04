package com.example.user.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring.config.LoginUser;

@Controller
public class UserController {
		
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(LoginUser loginUser) {
        ModelAndView model = new ModelAndView("index");
        model.addObject("user", loginUser);        
        return model;
    }
	
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
