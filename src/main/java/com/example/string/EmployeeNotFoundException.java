package com.example.string;

public class EmployeeNotFoundException extends RuntimeException{
    private final Employee employee;
    public EmployeeNotFoundException(Employee employee) {
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }
}
