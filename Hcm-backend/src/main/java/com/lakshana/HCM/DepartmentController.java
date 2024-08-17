package com.lakshana.HCM;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityNotFoundException;

@RestController
@CrossOrigin(origins = "*")
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	
	@PostMapping("/departments/create")
	public String create(@RequestBody Department d) {
		
		Department deptObject= service.createDepartment(d);
		if(deptObject!=null) {
			return "Created Department"; 
		}else{
			return "failed to create Department";
		}
	}
	
		//display all//
		@GetMapping("/departments")
		public List<Department> getAllDepartments(){
			return (List<Department>) service.getAllDepartments();
		}
		
		
		//display by id//
		@GetMapping("/departments/{id}")
		public Department getDepartmentById(@PathVariable long id) {
			Optional<Department> Department = service.getDepartmentByID(id);
	        if (Department.isPresent()) {
	            return Department.get();
	        } else {
	            throw new EntityNotFoundException("Department not found with id " + id);
	        }
		}

		
		//update//
		@PutMapping("/departments/update/{id}")
		public Department updateDepartmentMethod(@PathVariable long id, @RequestBody Department updatedDepartment) {
			return service.updateDepartment(id, updatedDepartment);
		}
		
		//delete//
		@DeleteMapping("/departments/delete/{id}")
		public String deleteDepartmentMethod(@PathVariable long id) {
			
			try {
				
				service.deleteDepartmentByID(id);
				return "successfully deleted Department with id: "+id;
				
			}catch(EntityNotFoundException e) {
				 return "failed !! Department not found! with id: "+id;
			}
		}
}
