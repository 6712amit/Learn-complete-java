package com.in28minute.rest.webservices.restfull_web_services.User;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class UserDaoServices {


// jpa/hibernate >> Database 

// For user Dao service we will use static list
// But in real time we will use database like mysql, oracle, postgresql etc.
private static List <User> users = new ArrayList<>();

static{
    users.add(new User(1, "Rahul", Date.valueOf("1999-12-01")));
    users.add(new User(2, "david", Date.valueOf("1996-12-01")));
    users.add(new User(3, "Geeta", Date.valueOf("1997-12-01")));
}

public List<User> getAllUsers(){
return users;
}

public String Save (User user){
  users.add(user);
  return "user details saved successfully";
}


public User getUser(int id) {
    for (int i = 0; i < users.size(); i++) {
        if (id == users.get(i).getId()) {
            return users.get(i);
        }
    }
    return null; // Return null if user not found
}

}
