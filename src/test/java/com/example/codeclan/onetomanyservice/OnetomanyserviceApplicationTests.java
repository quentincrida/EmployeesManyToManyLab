package com.example.codeclan.onetomanyservice;

import com.example.codeclan.onetomanyservice.models.Employee;
import com.example.codeclan.onetomanyservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnetomanyserviceApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveObject(){
		Employee employee = new Employee("John", "Smith", 1234);
		employeeRepository.save(employee);

		}



}
