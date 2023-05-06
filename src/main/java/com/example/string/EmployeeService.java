package com.example.string;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class EmployeeService {

    private static final int SIZE=3;
    private final List<Employee> employees = new ArrayList<>();

    public Employee add(String firstName, String lastName, int department, int salary) {
        Employee employee = new Employee(firstName, lastName, department, salary);
        if (employees.contains(employee)) {
                throw new EmployeeAlreadyAddedException();
            }
       if (employees.size() < SIZE);
        employees.add(employee);
        return employee;
    }
        public Employee remove (String firstName, String lastName, int department, int salary) {
        Employee employee = new Employee(firstName, lastName, department, salary);
            if (!employees.contains(employee)) {
                throw new EmployeeAlreadyAddedException();
            }
            employees.remove(employee);
            return employee;
        }

        public Employee find (String firstName, String lastName, int department, int salary) {
            Employee employee = new Employee(firstName, lastName,  department, salary);
            if (!employees.contains(employee)) {
               throw new EmployeeAlreadyAddedException();
            }
            return employee;
        }
        public List<Employee> getAll() {return new ArrayList<>(employees);}
}