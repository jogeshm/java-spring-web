package com.example.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller class to manage the controller logic as part of MVC framework.
 */

@Controller
public class HomeController {

    /**
     * You can also use @GetMapping or @PostMapping instead of generic @RequestMapping
     * @param model
     * @return String
     *
     */
    @RequestMapping(value= {"/home"}, method = RequestMethod.GET)
    public String showHome(Model model){
        model.addAttribute("username","Jogesh Malapaka");
        return "home.html";
    }
}
