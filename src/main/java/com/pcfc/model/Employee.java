package com.pcfc.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="firstname",nullable = false)
    private String firstName;
    @Column(name="lastname",nullable = false)
    private String lastName;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="dob",nullable = false)
    private Date dob;
    @ManyToOne
    @JoinColumn(name="department_id", nullable = false)
    private Department department;
    @Column(name="salary", nullable = false)
    private Double salary;
    @ManyToOne
    @JoinColumn(name="manager_id", nullable = true)
    private Employee manager;

    public Employee() {
    }

    public Employee(Long id, String firstName, String lastName, Date dob, Department department, Double salary, Employee manager) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.department = department;
        this.salary = salary;
        this.manager = manager;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", department=" + department +
                ", salary=" + salary +
                ", manager=" + manager +
                '}';
    }
}
