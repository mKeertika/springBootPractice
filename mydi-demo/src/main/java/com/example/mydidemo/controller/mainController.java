package com.example.mydidemo.controller;

import com.example.mydidemo.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class mainController {

    @GetMapping("/")
    public String index( Model model){

            model.addAttribute("customerForm", new Customer());
        return "contact";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute Customer customer){
        System.out.println(customer.toString());
        return "index";
    }

}
