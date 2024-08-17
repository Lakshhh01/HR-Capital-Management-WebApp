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
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityNotFoundException;

@RestController
@CrossOrigin(origins="*")
public class RecruitmentController {

	@Autowired
	RecruitmentService service;
	

	//Create//
	@PostMapping("/recruitment/create")
	public ResponseEntity<String> createRecruitmentMethod(@RequestBody Recruitment recruitment) {
	    Recruitment createRecruitmentObject = service.createRecruitment(recruitment);
	    if (createRecruitmentObject != null) {
//	        System.out.println(recruitment);
	        return ResponseEntity.ok("Recruitment created successfully");
	    } else {
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                             .body("Failed to create Recruitment.");
	    }
	}

	
	
	//display all//
	@GetMapping("/recruitment")
	public List<Recruitment> getAllRecruitments(){
		return service.getAllRecruitment();
	}
	
	
	@GetMapping("/recruitment/{id}")
	public Optional<Recruitment> getById(@PathVariable String id) {
		return service.getRecruitmentById(id);
	}
	
	//update//
	@PutMapping("/recruitment/update/{id}")
	public Recruitment updateRecruitmentMethod(@PathVariable String id, @RequestBody Recruitment updatedRecruitment) {
		return service.updateRecruitment(id, updatedRecruitment);
	}
	
	//delete//
	@DeleteMapping("/recruitment/delete/{id}")
	public String deleteRecruitmentMethod(@PathVariable String id) {
		
		try {
			
			service.deleteRecruitmentByID(id);
			return "successfully deleted Recruitment with id: "+id;
			
		}catch(EntityNotFoundException e) {
			 return "failed !! Recruitment not found! with id: "+id;
		}
	}


}
