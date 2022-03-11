package com.joshuamccluskey.bcrypt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainPageController {

    @GetMapping("/main/{username}")
    public String getManinPageForUser(@PathVariable String username,  Model m) {
        m.addAttribute("username", username);
        return "index.html";
    }
}
