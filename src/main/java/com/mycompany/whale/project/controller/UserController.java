/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.whale.project.controller;

import com.mycompany.whale.project.model.Authority;
import com.mycompany.whale.project.model.User;
import com.mycompany.whale.project.repo.AuthorityRepo;
import com.mycompany.whale.project.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UMBOON
 */
@RestController
public class UserController {
    
    @Autowired
    private UserRepo userRepo;  
    @Autowired
     private AuthorityRepo authorityrepo;
    
    @RequestMapping(value = "/saveuser",method = RequestMethod.POST)
    public void saveUser(@RequestBody User user){
        userRepo.save(user);
    }
    
    @RequestMapping(value = "/deleteuser",method = RequestMethod.POST)
    public void deleteUser(@RequestBody User user){
        userRepo.delete(user);
    }
    
    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public Page<User> getUser(Pageable pageable){
        return userRepo.findAll(pageable);
    }
    
    @RequestMapping(value = "/getauthority" , method = RequestMethod.GET)
    public Page<Authority> getAuthority (Pageable pageable){
      return authorityrepo.findAll(pageable);
    }
}
