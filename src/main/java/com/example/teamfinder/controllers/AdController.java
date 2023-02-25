package com.example.teamfinder.controllers;

import com.example.teamfinder.data.AdRepository;
import com.example.teamfinder.data.UserRepository;
import com.example.teamfinder.forms.AdForm;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/ad")
@Data
@AllArgsConstructor
public class AdController {

    private AdRepository adRepo;

    private UserRepository userRepo;

    @PostMapping("/make")
    public String saveAd(AdForm adForm, Principal principal) {
        adRepo.save(adForm.toAd(userRepo.findByUsername(principal.getName())));
        return "redirect:/";
    }

    @GetMapping("/make")
    public String makeAd() {
        System.out.println(adRepo.findAll());
        System.out.println(userRepo.findAll());
        return "makeAd";
    }

    @GetMapping("/{id}")
    public String showAd(@PathVariable("id") long id, Model model) {
        model.addAttribute("curr_ad", adRepo.findById(id).get());
        return "ad";
    }

//    @PostMapping("/{id}")
//    public String sendReq(@PathVariable("id") long id, Principal principal) {
//        adRepo.findById(id).get().s
//    }
}
