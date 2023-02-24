package com.example.teamfinder.controllers;

import com.example.teamfinder.forms.AdForm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ad")
public class AdController {


    @GetMapping("/make")
    public String makeAd(AdForm adForm) {
        return "makeAd";
    }
}
