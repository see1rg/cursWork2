package com.skypro.curswork2.exception;

public class RepeatQuestionException extends RuntimeException{
    public RepeatQuestionException() {
    }

    public RepeatQuestionException(String message) {
        super(message);
    }

    public RepeatQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepeatQuestionException(Throwable cause) {
        super(cause);
    }

    public RepeatQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
