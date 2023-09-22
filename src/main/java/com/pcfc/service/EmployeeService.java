package com.pcfc.service;

import com.pcfc.model.Department;
import com.pcfc.model.Employee;
import com.pcfc.model.constants.AppConstants;
import com.pcfc.model.exceptions.NoDataFoundException;
import com.pcfc.model.exceptions.RequiredFieldException;
import com.pcfc.repositories.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import static com.pcfc.model.constants.AppConstants.NO_DATA_FOUND_EXCEPTION_MSG;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    /*
     * save employee
     * */
    public void saveEmployee(Employee employee){
        validateRequest(employee);
        employeeRepository.save(employee);
    }

    /*
     * update employee
     * */
    public void updateEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    /*
     * Get all employees
     * */
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    /*
     * Get all employees as manager without himself
     * */
    public List<Employee> getAllEmployeesWithoutHimself(Integer id){
        Predicate<Employee> employeePredicate = (emp) -> emp.getId().intValue() != id.intValue();
        return employeeRepository
                .findAll()
                .stream()
                .filter(employeePredicate)
                .collect(Collectors.toList());
    }

    /*
     * Get employee by id
     * */
    public Employee getEmployeeById(Integer id){
        Optional<Employee> employee = employeeRepository.findById(id.longValue());

        if(!employee.isPresent()){
            log.error("Error occurred in EmployeeService::getEmployeeById {}", id);
            throw new NoDataFoundException(NO_DATA_FOUND_EXCEPTION_MSG,Boolean.TRUE);
        }

        return employee.get();
    }

    /*
     * To load initial data of employees
     * */
    public void loadInitialEmployeeData(){
        List<Employee> employeeList = new ArrayList<>();
        Employee manager1 = new Employee(1L, "John", "Doe", new Date(),
                new Department(1L,"IT"), 60000.0, null);
        Employee manager2 = new Employee(2L, "Jane", "Smith", new Date(),
                new Department(2L,"Finance"), 70000.0, null);
        Employee employee1 = new Employee(3L, "Alice", "Johnson", new Date(),
                new Department(3L,"Sales"), 45000.0, manager1);
        Employee employee2 = new Employee(4L, "Bob", "Brown", new Date(),
                new Department(1L,"IT"), 55000.0, manager2);

        employeeList.add(manager1);
        employeeList.add(manager2);
        employeeList.add(employee1);
        employeeList.add(employee2);

        employeeRepository.saveAll(employeeList);
    }

    /*
    * More validation can be add on demand
    * */
    private void validateRequest(Employee employee){
        if(AppConstants.EMPTY_STR.equals(employee.getFirstName().trim())){
            log.error("Error occurred in EmployeeService::validateRequest {}", employee);
            throw new RequiredFieldException(String.
                    format(AppConstants.REQUIRED_FIELD_EXCEPTION_MSG, "First name"),employee,Boolean.FALSE);
        }

        if(AppConstants.EMPTY_STR.equals(employee.getLastName().trim())){
            log.error("Error occurred in EmployeeService::validateRequest {}", employee);
            throw new RequiredFieldException(String.
                    format(AppConstants.REQUIRED_FIELD_EXCEPTION_MSG, "Last name"),employee,Boolean.FALSE);
        }

        if(employee.getDob().after(new Date())){
            log.error("Error occurred in EmployeeService::validateRequest {}", employee);
            throw new RequiredFieldException(String.
                    format(AppConstants.DOB_EXCEPTION_MSG, "Date of Birth"),employee,Boolean.FALSE);
        }
    }
}
