package com.demo.shoppingadmin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.demo.shoppingadmin.Admin;
import com.demo.shoppingadmin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        Admin admin = adminService.login(username, password);
        if (admin != null) {
            return "Login successful!";
        } else {
            return "Invalid credentials!";
        }
    }
}