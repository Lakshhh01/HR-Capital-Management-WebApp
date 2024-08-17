package com.lakshana.HCM;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;


@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository erepo;
	@Autowired
	DeletedEmployeeHistoryRepository archiveEmployee;
	
//	static int vacancyCount=0;
	
	
	
	//create employee//
	public Employee createEmployee(Employee emp) {
		return erepo.save(emp);
	}
	
	//display all employees//
	public Iterable<Employee> getAllEmployee(){
		return (List<Employee>) erepo.findAll();
	}
	
	//search employee by id//
	public Optional<Employee> getEmployeeById(long id) {
		return erepo.findById(id);
	}

	
	//update employee//
	public Employee updateEmployee(long id, Employee upadtedEmployee) {
		
		Optional<Employee> e = getEmployeeById(id);
		if(e.isPresent()) {
			Employee existingEmployee= e.get();
			existingEmployee.setAddress(upadtedEmployee.getAddress());
			existingEmployee.setDepartment(upadtedEmployee.getDepartment());
			existingEmployee.setDob(upadtedEmployee.getDob());
			existingEmployee.setEmail(upadtedEmployee.getEmail());
			existingEmployee.setEmpName(upadtedEmployee.getEmpName());
			existingEmployee.setGender(upadtedEmployee.getGender());
			existingEmployee.setSalary(upadtedEmployee.getSalary());
			return erepo.save(existingEmployee);
			
		}else {
			throw new EntityNotFoundException("Can't update, entity not found!");
		}
		
	}
	
	public void deleteEmployeeByID(long id) {
		Optional<Employee> e = erepo.findById(id);
		if(e.isPresent()) {
			
			
			Employee employeeToDelete = e.get();

	        // Create a new DeletedEmployee entity to store in the archive table
	        DeletedEmployee deletedEmployee = new DeletedEmployee();
	        deletedEmployee.setEmpId(employeeToDelete.getEmpId());
	        deletedEmployee.setEmpName(employeeToDelete.getEmpName());
	        deletedEmployee.setSalary(employeeToDelete.getSalary());
	        deletedEmployee.setGender(employeeToDelete.getGender());
	        deletedEmployee.setEmail(employeeToDelete.getEmail());
	        deletedEmployee.setDob(employeeToDelete.getDob());
	        deletedEmployee.setAddress(employeeToDelete.getAddress());
	        deletedEmployee.setCoreskill(employeeToDelete.getCoreskill());
	        deletedEmployee.setExperienceInYears(employeeToDelete.getExperienceInYears());
	        deletedEmployee.setDepartment(employeeToDelete.getDepartment());

	        // Save the deleted employee to the archive repository
	        archiveEmployee.save(deletedEmployee);
	        
//	        vacancyCount++;
			erepo.deleteById(id);
		}else {
			throw new EntityNotFoundException("can't delete , entity not found!");
		}
	}
	
	
	
	
}
