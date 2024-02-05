package com.spring.employees.exception.domain;

public class EmailNotFoundException extends Exception {
    public EmailNotFoundException(String message) {
        super(message); // passing the message to the constructor of the superclass
        // super refers to superclass
    }
}
