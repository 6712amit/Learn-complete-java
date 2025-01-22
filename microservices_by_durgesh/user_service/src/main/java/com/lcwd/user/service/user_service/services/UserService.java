package com.lcwd.user.service.user_service.services;

import java.util.List;

import com.lcwd.user.service.user_service.entities.User;

public interface UserService {
    
    //user operation
    //create

    public User saveUser(User user);

    //get all users from
    public List<User> getAllUsers();

    //get single user ny id
    public User getUserById(String id);

    // Delete a user
    public void deleteUser(String id);

    //update a user
    public User updateUser(User user);



}
