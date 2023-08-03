package com.ghulam.service;

import com.ghulam.dto.EmpReqDto;
import com.ghulam.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeServiceInterface {
    Employee addEmployee(EmpReqDto dto);
    Employee getEmployee(int empId);
    Employee updateEmployee(int empId, EmpReqDto updatedDto);
    Employee deleteEmployee(int empId);

    List<Employee> getAllEmployee();
}
