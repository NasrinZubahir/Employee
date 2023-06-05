package com.test.emp.EmpOperations.controller;

import com.test.emp.EmpOperations.model.Employee;
import com.test.emp.EmpOperations.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myrestapi/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PutMapping("/{employeeIdNumber}")
    public ResponseEntity<?> updateEmployee(@RequestBody Employee employee, @PathVariable("employeeIdNumber") Long employeeIdNumber) {
        //
        return employeeService.updateEmployee(employeeIdNumber,employee);
    }

}

