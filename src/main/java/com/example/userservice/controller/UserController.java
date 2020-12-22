/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.userservice.controller;

import com.example.userservice.model.User;
import com.example.userservice.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mith1
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    
    @GetMapping("/index")
    public String getUserData(){
        return "These are users";
    }
    
    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> users = userService.findAll();
//        for(User u : users){
//            System.out.println("u name -"+ u.getFirst_name());
//        }
        return userService.findAll();
    }
    
    @PostMapping("/saveUser")
    public void saveUser(User user){
//        System.out.println("got user -"+ user.toString());
        userService.saveUser(user);
    }
}