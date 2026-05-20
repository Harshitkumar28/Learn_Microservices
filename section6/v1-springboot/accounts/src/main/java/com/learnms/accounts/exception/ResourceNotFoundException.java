package com.learnms.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {

        // this RuntimeException only accepts a single string as parameter
        super(String.format("%s not found with the given input data %s: '%s'", resourceName, fieldName, fieldValue));
    }
}
