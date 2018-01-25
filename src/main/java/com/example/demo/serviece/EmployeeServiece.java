package com.example.demo.serviece;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiece {
    @Autowired
    EmployeeRepository  employeeRepository;
    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }
}
