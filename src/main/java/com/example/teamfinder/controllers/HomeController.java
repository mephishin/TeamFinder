package com.example.teamfinder.controllers;

import com.example.teamfinder.data.AdRepository;
import com.example.teamfinder.data.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@Data
@RequestMapping("/")
@AllArgsConstructor
public class HomeController {

    private AdRepository projectRepo;
    private UserRepository userRepo;


    @GetMapping("/")
    public String home(Principal principal) {
        System.out.println(principal);
        return "home";
    }

}
