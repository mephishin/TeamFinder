package com.example.teamfinder.forms;

import com.example.teamfinder.models.Ad;
import lombok.Data;

import java.security.Principal;

@Data
public class AdForm {
    private String name;
    private String content;

    public Ad makeAdForm(Principal principal) {
        return new Ad();
    }
}
