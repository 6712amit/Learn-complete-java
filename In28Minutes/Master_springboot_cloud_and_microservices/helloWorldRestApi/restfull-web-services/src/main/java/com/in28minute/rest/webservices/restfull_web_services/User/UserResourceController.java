package com.in28minute.rest.webservices.restfull_web_services.User;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResourceController {

private UserDaoServices service;

public UserResourceController(UserDaoServices service) {
this.service = service;
}


@GetMapping(path="/users")
public List<User> getAllUsers() {
 return service.getAllUsers();
}



@GetMapping(path="/users/user/{id}")
public User getUser(@PathVariable int id) {
 return service.getUser(id);
}


// @PostMapping(path="/users/user/{id}")
// public User getUser(@PathVariable int id) {
//  return service.getUser(id);
// }

}
