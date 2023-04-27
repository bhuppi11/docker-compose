package com.department.controller;

import com.department.model.Department;
import com.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;
    @GetMapping("/hello")
    public String hello() {
        return "hello from department controller...";
    }

    @PostMapping("/add-department")
    public String addDepartment(@RequestBody Department department) {
        departmentRepository.save(department);
        return "Department saved successfully....";
    }
}
