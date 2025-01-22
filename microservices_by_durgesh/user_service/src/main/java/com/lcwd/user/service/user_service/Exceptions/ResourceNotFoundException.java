package com.lcwd.user.service.user_service.Exceptions;

public class ResourceNotFoundException extends RuntimeException {
    // you can add extra properties that you want to manage here
    public ResourceNotFoundException() {
        super("Resource not found");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }
    
}
