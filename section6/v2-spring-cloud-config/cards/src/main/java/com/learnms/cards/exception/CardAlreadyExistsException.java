package com.learnms.cards.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CardAlreadyExistsException extends RuntimeException {

    public CardAlreadyExistsException(String message){
        super(message); // its job is to pass this message to its parent class, here 'RuntimeException' is parent class as it is being extended.
    }

}
