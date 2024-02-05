package com.spring.employees.exception.domain;

public class NotAnImageFileException extends Exception {
    public NotAnImageFileException(String message) {
        super(message);
    }
}
