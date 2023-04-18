package com.example.string;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {
    private final int SIZE=3;
    private final List<Employee> employees = new ArrayList<>(SIZE);
    @PostConstruct
    public void init() {
        employees.add(new Employee("Денис","Петров"));
        employees.add(new Employee("Илья","Петров"));
    }
    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.size()<SIZE) {
        for (Employee emp: employees) {
            if (employee.equals(employee)) {
                throw new EmployeeAlreadyAddedException();
                }
            }
        employees.add(employee);
        return employee;
            }
        throw new EmployeeStorageIsFullException();
    }
        public Employee find (String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
            if (employees.contains(employee)) {
                return employee;
            }
        throw new EmployeeNotFoundException(employee);
        }

        public Employee remove (String firstName, String lastName) {
            Employee employee = new Employee(firstName, lastName);
            if (employees.remove(employee)) {
                return employee;
            }
            throw new EmployeeNotFoundException(employee);
        }
}