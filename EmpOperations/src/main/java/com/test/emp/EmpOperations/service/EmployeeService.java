package com.test.emp.EmpOperations.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.test.emp.EmpOperations.model.Employee;
import com.test.emp.EmpOperations.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  //  @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    ObjectMapper mapper;

    public ResponseEntity<?> updateEmployee(Long employeeId, Employee e) {
        /*
        call repository findById method to check Employee exist for that Id or not and then call save method as below
        Optional<Employee> employeeData = employeeRepository.findById(employeeId);

    if (employeeData.isPresent()) {
     Employee employee = employeeData.get();
      employee.setFirstName(e.getFirstName();

      return new ResponseEntity<>(employeeRepository.save(employee), HttpStatus.OK);
    }
         */
        ObjectNode node= mapper.createObjectNode();
        node.put("apiStatus", "Success");
        return ResponseEntity.status(HttpStatus.OK).body(node);
    }


}
