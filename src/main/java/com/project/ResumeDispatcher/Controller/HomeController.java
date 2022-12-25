package com.project.ResumeDispatcher.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HomeController {
    
    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", "Thank you for visiting.");

        // return view name
        return "home";

    }
    
}
