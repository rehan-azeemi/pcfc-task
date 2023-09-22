package com.pcfc.controller;

import com.pcfc.model.Employee;
import com.pcfc.service.DepartmentService;
import com.pcfc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import static com.pcfc.model.constants.AppConstants.*;

@Controller
public class EmployeeController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String home(Model model) {
        return HOME_PAGE;
    }

    @GetMapping(NEW_EMPLOYEE_PATH)
    public String addEmployee(Model model) {
        model.addAttribute("departments",departmentService.getAllDepartments());
        model.addAttribute("employees", employeeService.getAllEmployees());
        model.addAttribute("employee",new Employee());
        return ADD_EMPLOYEE_PAGE;
    }

    @PostMapping(SAVE_EMPLOYEE_PATH)
    public String saveEmployee(@ModelAttribute(name = "employee") Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:".concat(LISTING_EMPLOYEE_PATH);
    }

    @GetMapping(LISTING_EMPLOYEE_PATH)
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return LISTING_EMPLOYEE_PAGE;
    }

    @GetMapping(EDIT_EMPLOYEE_PATH)
    public String editEmployee(@PathVariable(name = "id") Integer id, Model model) {
        model.addAttribute("departments",departmentService.getAllDepartments());
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        model.addAttribute("employees", employeeService.getAllEmployeesWithoutHimself(id));
        return EDIT_EMPLOYEE_PAGE;
    }

    @PostMapping (UPDATE_EMPLOYEE_PATH)
    public String updateEmployee(@ModelAttribute(name = "employee") Employee employee) {
        employeeService.updateEmployee(employee);
        return "redirect:".concat(LISTING_EMPLOYEE_PATH);
    }

    @GetMapping(VIEW_EMPLOYEE_PATH)
    public String viewEmployee(@PathVariable(name = "id") Integer id, Model model) {
        model.addAttribute("employee", employeeService.getEmployeeById(id));
        return VIEW_EMPLOYEE_PAGE;
    }
}
