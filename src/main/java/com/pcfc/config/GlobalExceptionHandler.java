package com.pcfc.config;

import com.pcfc.model.exceptions.NoDataFoundException;
import com.pcfc.model.exceptions.RequiredFieldException;
import com.pcfc.service.DepartmentService;
import com.pcfc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import static com.pcfc.model.constants.AppConstants.ADD_EMPLOYEE_PAGE;
import static com.pcfc.model.constants.AppConstants.HOME_PAGE;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;
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
        model.addAttribute("departments",departmentService.getAllDepartments());
        model.addAttribute("employees", employeeService.getAllEmployees());
        model.addAttribute("employee", e.getEmployee());
        model.addAttribute("errorMessage", e.getMessage());
        model.addAttribute("homeRedirection",e.isHomeRedirection());
        return ADD_EMPLOYEE_PAGE;
    }
}
