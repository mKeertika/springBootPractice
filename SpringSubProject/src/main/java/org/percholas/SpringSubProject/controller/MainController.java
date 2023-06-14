package org.percholas.SpringSubProject.controller;

import org.percholas.SpringSubProject.model.User;
import org.percholas.SpringSubProject.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    public IUserService userService;

    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @GetMapping("/register")
    public String register() {

        return "register";
    }


    @PostMapping("/createUser")
    public String createUser(@ModelAttribute User user) {
//checking email already exist
        boolean checkEmailExistence = userService.checkIfEmailExist(user.getEmail());
        System.out.println(checkEmailExistence);
        if (checkEmailExistence) {
            System.out.println("email id already exist");
        }
        else {
//        saving input user records from register form into database
            User userDetails = userService.createUser(user);
            if (userDetails != null) {
                //checking whether it is entering in database or not
                System.out.println("register successfully");
            } else {
                System.out.println("something went wrong");
            }
        }
        return "redirect:/register";
    }
}
