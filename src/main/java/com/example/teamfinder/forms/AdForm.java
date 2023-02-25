package com.example.teamfinder.forms;

import com.example.teamfinder.data.UserRepository;
import com.example.teamfinder.models.Ad;
import com.example.teamfinder.models.User;
import lombok.Data;

import java.security.Principal;

@Data
public class AdForm {
    private String name;
    private String content;

    public Ad toAd(User user) {
        return new Ad(name, content, user);
    }
}
