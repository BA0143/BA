package com.zinios.rdc.redisDemoApp.controller;

import com.zinios.rdc.redisDemoApp.model.User;
import com.zinios.rdc.redisDemoApp.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserRepository userRepository;

    @RequestMapping(value = "/addUser/{id}/{name}", method = RequestMethod.GET)
    public void addUser(@PathVariable("id") String userId,
                        @PathVariable("name") String name){
        userRepository.save(new User(userId,name,2000L));

    }

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public Object getUser(@PathVariable("id") String userId){
      return  userRepository.getUserById(userId);
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public Object findAllUsers(){
        return userRepository.findAllUser();
    }
    
}
