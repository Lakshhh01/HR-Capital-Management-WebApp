package com.lakshana.HCM;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository drepo;
	

	//create department//
	
	public Department createDepartment(Department department) {
		return drepo.save(department);
	}
	
	
	//display all departments //
	
	public List<Department> getAllDepartments(){
		return (List<Department>) drepo.findAll();
	}
	
	
	//update//
	/*
	 * update hone k baad updated department entity ko return karna padega, 
	 * so that upadted entity details will be diplsayed on screen
	 */
	public Department updateDepartment(long id, Department updatedDept) {
		Optional<Department> d = getDepartmentByID(id);		//for not null
		if(d.isPresent()) {
			Department existingdepDepartment=d.get();		//optional method
			existingdepDepartment.setDeptManager(updatedDept.getDeptManager());
			existingdepDepartment.setDeptName(updatedDept.getDeptName());
			existingdepDepartment.setEmpList(updatedDept.getEmpList());
			return drepo.save(existingdepDepartment);
		}
		else {
			throw new EntityNotFoundException("entity not found with id:"+id);
		}
	}
	
	
	//delete department by id//
	
	public void deleteDepartmentByID(long deptid) {
		if(drepo.existsById(deptid)) {
			drepo.deleteById(deptid);
		}else {
			throw new EntityNotFoundException("Department not found with id :"+ deptid);
//			System.out.println("entity not found");//yaha pr custom exception do
		}
		
	}
	
	//search departments by id//
	
	public Optional<Department> getDepartmentByID(long deptid) { 
		return drepo.findById(deptid);
	}


}
