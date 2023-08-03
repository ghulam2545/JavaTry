package com.ghulam.controller;

import com.ghulam.dto.EmpReqDto;
import com.ghulam.response.Response;
import com.ghulam.service.impl.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService empService;

    @PostMapping("/add_emp")
    public ResponseEntity<Object> addEmployee(@RequestBody EmpReqDto dto) {
        var emp = empService.addEmployee(dto);
        return Response.handler("add message", HttpStatus.OK, emp);
    }

    @GetMapping("/get_emp/{empId}")
    public ResponseEntity<Object> getEmployee(@PathVariable int empId) {
        var emp = empService.getEmployee(empId);
        return Response.handler("get message", HttpStatus.OK, emp);
    }

    @PutMapping("/update_emp/{empId}")
    public ResponseEntity<Object> updateEmployee(@PathVariable int empId, @RequestBody EmpReqDto dto) {
        var emp = empService.updateEmployee(empId, dto);
        return Response.handler("update message", HttpStatus.OK, emp);
    }

    @DeleteMapping("/delete_emp/{empId}")
    public ResponseEntity<Object> deleteEmployee(@PathVariable int empId) {
        var emp = empService.deleteEmployee(empId);
        return Response.handler("delete message", HttpStatus.OK, emp);
    }

    @GetMapping("/get_all_emp")
    public ResponseEntity<Object> getAllEmployee() {
        var allEmp = empService.getAllEmployee();
        return Response.handler("get all message", HttpStatus.OK, allEmp);
    }
}
