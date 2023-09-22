package com.pcfc.config;

import com.pcfc.model.exceptions.NoDataFoundException;
import com.pcfc.model.exceptions.RequiredFieldException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import static com.pcfc.model.constants.AppConstants.ADD_EMPLOYEE_PAGE;
import static com.pcfc.model.constants.AppConstants.HOME_PAGE;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handleGenericException(Exception e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        model.addAttribute("homeRedirection",Boolean.TRUE);
        return HOME_PAGE;
    }

    @ExceptionHandler(NoDataFoundException.class)
    public String handleGenericException(NoDataFoundException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        model.addAttribute("homeRedirection",e.isHomeRedirection());
        return HOME_PAGE;
    }

    @ExceptionHandler(RequiredFieldException.class)
    public String handleGenericException(RequiredFieldException e, Model model) {
        model.addAttribute("employee", e.getEmployee());
        model.addAttribute("errorMessage", e.getMessage());
        model.addAttribute("homeRedirection",e.isHomeRedirection());
        return ADD_EMPLOYEE_PAGE;
    }
}
