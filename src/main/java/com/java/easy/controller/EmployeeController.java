package com.java.easy.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.easy.model.Employee;

@RestController
@RequestMapping(value="employee")
public class EmployeeController {
	
	@RequestMapping(value = "getEmployee", method = RequestMethod.GET)
	public List<Employee> getEmployee() {
		System.out.println("in getEmployee");
		Employee employee = new Employee();
		employee.setAddress("67/1 Swargate");
		employee.setName("Sameer");
		return Arrays.asList(employee);
	}

	@RequestMapping(value ="saveEmployee", method = RequestMethod.PUT)
	public String saveEmployee(@RequestBody Employee employee) throws Exception {
		System.out.println("saveEmployee " + employee);
		if (employee.getId() > 500) {
			throw new Exception("Employee Id limit excedeed");
		}
		return "SUCCESS";
	}

	@RequestMapping(value = "deleteEmployee/{empId}", method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable("empId") Integer empId) throws Exception {
		System.out.println("in deleteEmployee" + empId);
		return "Employee deleted successfully";
	}
	
	
	@RequestMapping(value = "updateEmployee", method = RequestMethod.POST)
	public String updateEmployee(@RequestBody Employee employee) {
		System.out.println("in updateEmployee");
		return "Employee updated successfully";
	}
	
}
