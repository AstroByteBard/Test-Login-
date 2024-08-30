package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
public class AppController {

    member member = new member();

    @GetMapping("/Login")
    public String Login(Model model) {
        model.addAttribute("User", new member());
        return "LoginWeb";
    }
    @PostMapping("/Profile")
    public String Profile() {
        //TODO: process POST request
        return "ProfileWeb";
    }
    

}
