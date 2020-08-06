package com.thoughtworks.springbootemployee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class TodoitemNotFoundException extends RuntimeException {
    @Override
    public String getMessage() {
        return "TodoitemNotFoundException";
    }
}
