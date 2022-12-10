package com.skypro.curswork2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class IncorrectNumberOfQuestions extends RuntimeException{
    public IncorrectNumberOfQuestions() {
    }

    public IncorrectNumberOfQuestions(String message) {
        super(message);
    }

    public IncorrectNumberOfQuestions(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectNumberOfQuestions(Throwable cause) {
        super(cause);
    }

    public IncorrectNumberOfQuestions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
