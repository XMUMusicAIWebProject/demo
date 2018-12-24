package com.musicai.webdemo.controller;

import com.musicai.webdemo.entity.Manager;
import com.musicai.webdemo.service.ManagerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@AllArgsConstructor
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @GetMapping({"/", "/index", "/home"})
    public String root(){
        return "index.html";
    }

    @GetMapping("/login")
    public String login(){
        System.out.println("------------String login()-------------");
        return "login.html";
    }

    @GetMapping("/user")
    public String user(@AuthenticationPrincipal Principal principal, Model model){
        model.addAttribute("username", principal.getName());
        return "user/user.html";
    }

}
