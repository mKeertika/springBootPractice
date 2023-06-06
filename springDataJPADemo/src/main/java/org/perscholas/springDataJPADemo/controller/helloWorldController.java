package org.perscholas.springDataJPADemo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping("/helloJi/{id}")
    public String sayHello(@PathVariable int userId){
        return ("id is = " + userId);

    }
}
