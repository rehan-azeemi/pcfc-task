package com.pcfc;

import com.pcfc.service.DepartmentService;
import com.pcfc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PcfcAppApplication extends SpringBootServletInitializer implements ApplicationRunner {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private EmployeeService employeeService;
    public static void main(String[] args) {
        SpringApplication.run(PcfcAppApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PcfcAppApplication.class);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        departmentService.loadInitialDepartmentData();
        employeeService.loadInitialEmployeeData();
    }
}
