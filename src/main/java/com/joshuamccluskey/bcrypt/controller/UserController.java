package com.joshuamccluskey.bcrypt.controller;

import com.joshuamccluskey.bcrypt.model.AccessUser;
import com.joshuamccluskey.bcrypt.repository.AccessUserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
    AccessUserRepository accessUserRepository;

    @GetMapping("/")
    public String getLogin() {
        return "index.html";

    }

    @PostMapping("/login")

    public RedirectView login(String username, String password) {
        AccessUser newUser = new AccessUser(username, password);
        accessUserRepository.save(newUser);
        return new RedirectView("/");
    }

    @GetMapping("/createaccount")
    public String getCreateAccount() {
        return "create-account.html";
    }

    @PostMapping("/createaccount")
    public RedirectView createaccount(String username, String password) {
//        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());  // use default of 10
        AccessUser newUser = new AccessUser(username, password);
        accessUserRepository.save(newUser);


        return new RedirectView("/");

    }
}
