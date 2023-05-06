package com.example.string;

import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee findEmployeeWithMaxSalaryFromDepartment (
                @RequestParam("departmentId") int department) {
            return departmentService.findEmployeeWithMaxSalaryFromDepartment(department);
        }

    @GetMapping("/min-salary")
    public Employee findEmployeeWithMinSalaryFromDepartment (
            @RequestParam("departmentId") int department) {
        return departmentService.findEmployeeWithMinSalaryFromDepartment(department);
    }
    @GetMapping("/all")
    public Map<Integer, List<Employee>> findEmployee() {
        return departmentService.findEmployeeByDepartment();
    }
    @GetMapping(value = "/all", params = "departmentId")
    public List<Employee> findEmployeeFromDepartment (
            @RequestParam("departmentId") int department) {
        return departmentService.findEmployeeFromDepartment(department);
    }

}