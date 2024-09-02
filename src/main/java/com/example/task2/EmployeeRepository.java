package com.example.task2;

import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.task2.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

