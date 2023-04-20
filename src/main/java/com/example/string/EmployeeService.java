package com.example.string;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class EmployeeService {
    private final int SIZE=3;
    private final Map<String, Employee> employees = new HashMap<>(SIZE);

    public Employee add(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(employee.getFullName())) {
                throw new EmployeeAlreadyAddedException();
            }
        employees.put(employee.getFullName(), employee);
        return employee;
    }
        public Employee find (String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
            if (employees.containsKey(employee.getFullName())) {
                return employees.get(employee.getFullName());
            }
        throw new EmployeeNotFoundException(employee);
        }

        public Employee remove (String firstName, String lastName) {
            Employee employee = new Employee(firstName, lastName);
            if (employees.containsKey(employee.getFullName())) {
                employees.remove(employee.getFullName());
                return employee;
            }
            throw new EmployeeNotFoundException(employee);
        }
}