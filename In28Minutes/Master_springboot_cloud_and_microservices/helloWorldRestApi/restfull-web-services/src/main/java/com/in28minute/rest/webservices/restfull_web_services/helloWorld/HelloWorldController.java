package com.in28minute.rest.webservices.restfull_web_services.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


// @RequestMapping(method = RequestMethod.GET,path = "/helloWorld")
// public String HelloWorld(){
//     return "Hello World";
// }
@GetMapping(path="/hello-world")
public String HelloWorld(){
    return "Hello World";
}

@GetMapping(path="/hello-world-bean")
public Helloworldbean HelloWorldBean(){
    return new Helloworldbean("hello world bean");
}
//path paramenter
// e.g= /hello-world/PathVariable/{name}
// @PathVariable
@GetMapping(path="/hello-world/path-variable/{name}")
public String HelloWorldPathVariable(@PathVariable String name){

    return "hello world " +name;
}

}
