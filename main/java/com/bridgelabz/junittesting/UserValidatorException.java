package com.bridgelabz.junittesting;

public class UserValidatorException extends RuntimeException {
    String message;

    public enum ExceptionType{
        ENTERED_NULL, ENTERED_EMPTY
    }

    ExceptionType type;

    public UserValidatorException(String message, ExceptionType type) {
        this.message = message;
        this.type = type;
    }
}
