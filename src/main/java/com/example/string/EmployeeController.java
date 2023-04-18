package com.example.string;

import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.add(firstName,lastName);
    }
    @GetMapping("/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.find(firstName,lastName);
    }
    @GetMapping("/remove")
    public Employee remove(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.remove(firstName,lastName);
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    public String employeeNotFoundExceptionHandler(EmployeeNotFoundException e){
        return "Сотрудник"+e.getEmployee()+"не найден";
    }

}
