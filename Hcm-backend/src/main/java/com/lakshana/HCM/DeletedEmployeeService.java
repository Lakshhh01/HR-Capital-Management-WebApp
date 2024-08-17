package com.lakshana.HCM;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeletedEmployeeService {

	
	@Autowired
	DeletedEmployeeHistoryRepository repo;
	
	//display list of employees deleted //
	
	public List<DeletedEmployee> deletedEmployees(){
		return (List<DeletedEmployee>) repo.findAll();
	}
	public Optional<DeletedEmployee> getById(long id ){
		return repo.findById(id);
	}
	
	
}
