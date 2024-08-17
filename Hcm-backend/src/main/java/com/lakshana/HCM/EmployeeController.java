package com.lakshana.HCM;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityNotFoundException;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	
	//Create//
	@PostMapping("/api/employees/create")
	public String createEmployeeMethod(@RequestBody Employee emp) {
		Employee createEmployeeObject=service.createEmployee(emp);
		if(createEmployeeObject!=null) {
			return "employee added successfully";
		}else {
			return "Failed! to add employee";
		}
	}
	
	
	//display all//
	@GetMapping("/api/employees")
	public List<Employee> getAllEmployees(){
		return (List<Employee>) service.getAllEmployee();
	}
	
	
	//display by id//
	@GetMapping("/api/employees/{id}")
	public Employee getEmployeeById(@PathVariable long id) {
		Optional<Employee> employee = service.getEmployeeById(id);
        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new EntityNotFoundException("Employee not found with id " + id);
        }
	}

	
	//update//
	@PutMapping("/api/employees/update/{id}")
	public Employee updateEmployeeMethod(@PathVariable long id, @RequestBody Employee updatedEmployee) {
		return service.updateEmployee(id, updatedEmployee);
	}
	
	//delete//
	@DeleteMapping("/api/employees/delete/{id}")
	public String deleteEmployeeMethod(@PathVariable long id) {
		
		try {
			
			service.deleteEmployeeByID(id);
			return "successfully deleted employee with id: "+id;
			
		}catch(EntityNotFoundException e) {
			 return "failed !! employee not found! with id: "+id;
		}
	}
	
	

	
}
	