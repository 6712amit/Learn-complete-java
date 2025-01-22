package com.lcwd.user.service.user_service.services.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.lcwd.user.service.user_service.Exceptions.ResourceNotFoundException;
import com.lcwd.user.service.user_service.UserRepository.UserRepository;
import com.lcwd.user.service.user_service.entities.User;
import com.lcwd.user.service.user_service.services.UserService;


@Service
public class UserServiceImple implements UserService{
@Autowired
private UserRepository userRepository;


 public UserServiceImple(UserRepository userRepository) {
    this.userRepository = userRepository;
}

public User saveUser(User user){
    return userRepository.save(user);
         
 }

    //get all users from
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    //get single user ny id
    public User getUserById(String id){
        return userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Resource does not exist"));
    }

    // Delete a user
    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

    //update a user


    public User updateUser(User user) {
        // Check if the user exists in the database
        return userRepository.findById(user.getId())
                .map(existingUser -> {
                    // Update the fields of the existing user
                    existingUser.setName(user.getName());
                    existingUser.setEmail(user.getEmail());
                    existingUser.setPhone(user.getPhone());
                    // Add other fields as necessary
                    return userRepository.save(existingUser);
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    }
}



