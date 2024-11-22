package com.blog3.exception;

import org.springframework.http.HttpStatus;

public class BlogAPIException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BlogAPIException(HttpStatus badRequest, String message) {
        super(message);
    }

    public BlogAPIException(String message, Throwable cause) {
        super(message, cause);
    }
}