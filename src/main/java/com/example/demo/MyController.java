package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *
 * <p>Created by irina on 5/3/2022.</p>
 * <p>Project: demo</p>
 * *
 */
@Controller
@RequestMapping("/home")
public class MyController {

    @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home_attr1", "hello");
        return "home";
    }

    @RequestMapping("/test")
    public String test(ModelMap model) {
        model.addAttribute("test_attr1", "test");
        return "test";
    }
}
