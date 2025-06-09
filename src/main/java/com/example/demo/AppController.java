package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AppController {
    
    @GetMapping({"", "/", "/home", "dashboard", "/birds/"})
    public String showDashBoard() {
        return "redirect:/birds";
    }
    
}
