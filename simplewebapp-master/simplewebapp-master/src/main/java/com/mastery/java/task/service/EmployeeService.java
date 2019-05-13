package com.mastery.java.task.service;

import com.mastery.java.task.dto.Employee;


import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void removeEmployee(int id);

    Employee getEmployeeById(int id);

    List<Employee> listEmployees();
}
