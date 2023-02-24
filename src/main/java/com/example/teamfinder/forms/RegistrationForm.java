package com.example.teamfinder.forms;

import com.example.teamfinder.models.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@Data
public class RegistrationForm {

    private String username;
    private String password;
    private String firstname;
    private String surname;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(username, passwordEncoder.encode(password), firstname, surname, new ArrayList<>());
    }
}