package com.perscholas.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    @Value("${spring.application.name}")
    String appName;
//    String appName1;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }

//    @GetMapping("/")
//    public String profilePage(Model model) {
//        model.addAttribute("appName", appName1);
//        model.addAttribute("name", "Keertika");
//        model.addAttribute("age", "18+");
//        return "nameage";
//    }
}