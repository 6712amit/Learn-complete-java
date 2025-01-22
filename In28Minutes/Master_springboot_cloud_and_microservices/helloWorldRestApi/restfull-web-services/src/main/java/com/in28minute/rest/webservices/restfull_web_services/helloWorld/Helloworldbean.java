package com.in28minute.rest.webservices.restfull_web_services.helloWorld;

public class Helloworldbean {


    private String message;
    
        public Helloworldbean(String message) {
            //TODO Auto-generated constructor stub
            this.message=message;
    }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return "Helloworldbean [message=" + message + "]";
        }



}
