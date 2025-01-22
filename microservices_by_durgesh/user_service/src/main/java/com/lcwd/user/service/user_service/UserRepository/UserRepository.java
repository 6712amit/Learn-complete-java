package com.lcwd.user.service.user_service.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.user.service.user_service.entities.User;

public interface UserRepository extends JpaRepository<User, String> {



    
    
}
