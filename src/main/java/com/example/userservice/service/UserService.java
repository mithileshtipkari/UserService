/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.userservice.service;

import com.example.userservice.model.User;
import com.example.userservice.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mith1
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    
    public List<User> findAll(){
        return userRepository.findAll();
    }
    
    public void saveUser(User user){
        userRepository.save(user);
    }
}
