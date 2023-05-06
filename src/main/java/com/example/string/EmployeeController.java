package com.example.string;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

import java.awt.*;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int department, @RequestParam int  salary) {
        return employeeService.add(firstName,lastName,department,salary);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int department, @RequestParam int  salary) {
        return employeeService.find(firstName,lastName,department,salary);
    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int department, @RequestParam int  salary) {
        return employeeService.remove(firstName,lastName,department,salary);
    }

    @GetMapping
    public List<Employee> getAll() {return employeeService.getAll();
    }
}
