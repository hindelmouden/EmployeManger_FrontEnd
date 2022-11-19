package com.example.app_employee.exception;

public class UserNotFoundExecption extends RuntimeException {
    public UserNotFoundExecption(String message) {
        super(message);
    }
}
