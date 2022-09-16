package com.example.pp_3_1_2.controllers;

import com.example.pp_3_1_2.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showUser(Principal principal,Model model) {
        model.addAttribute("user", userService.getUserById(userService.getUserByUserName(principal.getName()).getId()));
        return "startUser";
    }
}
