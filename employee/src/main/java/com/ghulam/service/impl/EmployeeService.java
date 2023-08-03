package com.ghulam.service.impl;

import com.ghulam.dto.EmpReqDto;
import com.ghulam.model.Employee;
import com.ghulam.repository.EmployeeRepository;
import com.ghulam.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {
    @Autowired
    EmployeeRepository empRepo;

    @Override
    public Employee addEmployee(EmpReqDto dto) {
        //  ?????????????????????
        Employee emp = new Employee();
        emp.setEmpName(dto.getEmpName());
        emp.setGender(dto.getGender());
        emp.setAddress(dto.getAddress());
        emp.setEmail(dto.getEmail());
        emp.setMobNo(dto.getMobNo());

        return empRepo.save(emp);
    }

    @Override
    public Employee getEmployee(int empId) {
        try {
            return empRepo.findById(empId).get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Employee();
    }

    @Override
    public Employee updateEmployee(int empId, EmpReqDto updatedDto) {
        try {
            Employee emp = empRepo.findById(empId).get();
            emp.setEmpName(updatedDto.getEmpName());
            emp.setGender(updatedDto.getGender());
            emp.setAddress(updatedDto.getAddress());
            emp.setEmail(updatedDto.getEmail());
            emp.setMobNo(updatedDto.getMobNo());
            
            return empRepo.save(emp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Employee();
    }

    @Override
    public Employee deleteEmployee(int empId) {
        try {
            Employee emp = empRepo.findById(empId).get();
            empRepo.deleteById(empId);
            return  emp;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new Employee();
    }

    @Override
    public List<Employee> getAllEmployee() {
        try {
            return empRepo.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Collections.emptyList();
    }
}
