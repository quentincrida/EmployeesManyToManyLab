package com.example.codeclan.onetomanyservice.repositories;

import com.example.codeclan.onetomanyservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
