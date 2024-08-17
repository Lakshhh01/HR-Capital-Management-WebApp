package com.lakshana.HCM;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityNotFoundException;

@RestController
@CrossOrigin(origins="*")
public class DeletedEmployeeController {
	
	@Autowired
	DeletedEmployeeService service;
	
	@GetMapping("/archives")
	public List<DeletedEmployee> getAllArchives(){
		
		return service.deletedEmployees();
	}
	
	@GetMapping("/archives/{id}")
	public  DeletedEmployee getEmployeeById(@PathVariable long id){
		Optional<DeletedEmployee> e= service.getById(id);
		 if(e.isPresent()) {
			 return e.get();
			 
		 }else {
			 throw new EntityNotFoundException("Employee not found with id" + id);
		 }
	}

}
