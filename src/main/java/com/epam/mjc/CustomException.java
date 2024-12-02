package com.epam.mjc;

public class CustomException extends IllegalArgumentException {
    public CustomException(long id) {
        super("Could not find student with ID " + id);
    }
}
