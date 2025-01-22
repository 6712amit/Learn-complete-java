package com.lcwd.user.service.user_service.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.user_service.entities.User;
import com.lcwd.user.service.user_service.services.UserService;
import com.lcwd.user.service.user_service.services.imple.UserServiceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    // create

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
        
    }

    // singles user get

    @GetMapping("/{userId}")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
        User user = userService.getUser(userId);  
        return ResponseEntity.ok(user);
    }

    // All user get

    // delete user

    // update user

}
