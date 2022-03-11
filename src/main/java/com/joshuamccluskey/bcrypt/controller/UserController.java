package com.joshuamccluskey.bcrypt.controller;

import com.joshuamccluskey.bcrypt.model.AccessUser;
import com.joshuamccluskey.bcrypt.repository.AccessUserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
    @Autowired
    AccessUserRepository accessUserRepository;

    @GetMapping("/")
    public String getLoginPageToLogin() {
        return "login.html";

    }

    @PostMapping("/login")

    public RedirectView loginUsernameAndPassword(String username, String password) {
        AccessUser newUser = accessUserRepository.findByUsername(username);
        if(newUser == null){
            return new RedirectView("/login/");
        }
        boolean checksPasswordIsCorrect = BCrypt.checkpw(password, newUser.getPassword());

        if(!checksPasswordIsCorrect) {
            return new RedirectView("/login/");
        } else {
            return new RedirectView("/main/" + username);
        }
    }

    @GetMapping("/signup")
    public String getSignUpFormForAcccountCreation() {
        return "signup.html";
    }

    @PostMapping("/signup")
    public RedirectView createAccountToAccessSite(String username, String password) {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        AccessUser newUser = new AccessUser(username, hashedPassword);
        accessUserRepository.save(newUser);
        return new RedirectView("/");

    }
}
