package com.pcfc.model.exceptions;

import com.pcfc.model.Employee;

public class RequiredFieldException extends RuntimeException{
    private String errorMessage;
    private Employee employee;

    private boolean homeRedirection;

    public RequiredFieldException(String errorMessage, Employee employee, boolean homeRedirection) {
        super(errorMessage);
        this.errorMessage = errorMessage;
        this.employee = employee;
        this.homeRedirection = homeRedirection;
    }

    public Employee getEmployee() {
        return employee;
    }

    public boolean isHomeRedirection() {
        return homeRedirection;
    }
}
