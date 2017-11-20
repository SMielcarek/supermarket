package com.supermarket.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Product")
public class ProductNotFoundException extends RuntimeException {
    // ...
}