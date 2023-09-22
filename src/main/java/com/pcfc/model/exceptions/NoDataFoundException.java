package com.pcfc.model.exceptions;

public class NoDataFoundException extends RuntimeException{
    private String errorMessage;

    private boolean homeRedirection;

    public NoDataFoundException(String errorMessage, boolean homeRedirection) {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.homeRedirection = homeRedirection;
    }

    public boolean isHomeRedirection() {
        return homeRedirection;
    }
}
