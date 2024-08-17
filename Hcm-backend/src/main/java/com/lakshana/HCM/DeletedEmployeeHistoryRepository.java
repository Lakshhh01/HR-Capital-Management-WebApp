package com.lakshana.HCM;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeletedEmployeeHistoryRepository extends CrudRepository<DeletedEmployee, Long>{

	void save(Optional<Employee> e);	

}
