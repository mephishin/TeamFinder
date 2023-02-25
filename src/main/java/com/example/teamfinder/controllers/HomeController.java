package com.example.teamfinder.controllers;

import com.example.teamfinder.data.AdRepository;
import com.example.teamfinder.data.UserRepository;
import com.example.teamfinder.models.Ad;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
@Data
@RequestMapping("/")
@AllArgsConstructor
public class HomeController {
    private UserRepository userRepo;
    private AdRepository adRepo;


    @ModelAttribute("ads")
    public Iterable<Ad> adList() {
        return adRepo.findAll();
    }

    @PostMapping("/filter")
    public String filter(@RequestParam String filter, Model model) {
        Iterable<Ad> ads;
        if(filter != null && !filter.isEmpty()) {
            ads = adRepo.findAdsByName(filter);
        }
        else {
            ads = adRepo.findAll();
        }
        model.addAttribute("ads", ads);
        return "home";
    }

    @GetMapping("/")
    public String home(Principal principal) {
        System.out.println(principal + "\n" + userRepo.findAll());
        return "home";
    }

}
