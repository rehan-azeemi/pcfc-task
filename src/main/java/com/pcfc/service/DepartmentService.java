package com.pcfc.service;

import com.pcfc.model.Department;
import com.pcfc.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    /*
    * Get all departments
    * */
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    /*
    * Load initial department data
    * */
    public void loadInitialDepartmentData(){
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new Department(1L,"IT"));
        departmentList.add(new Department(2L,"Finance"));
        departmentList.add(new Department(3L,"Sales"));

        departmentRepository.saveAll(departmentList);
    }
}
