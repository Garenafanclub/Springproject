package com.mayank.Web_cart.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home()
    {
        return "Welcome to our Website.";
    }
}
