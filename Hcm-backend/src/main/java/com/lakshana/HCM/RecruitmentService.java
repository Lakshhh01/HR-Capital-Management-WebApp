package com.lakshana.HCM;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

@Service
public class RecruitmentService {
	
	@Autowired
	RecruitmentRepository repo;
	
	//create Recruitment//
	public Recruitment createRecruitment(Recruitment r) {
		return repo.save(r);
	}
	
	//display all Recruitments//
	public List<Recruitment> getAllRecruitment(){
		return (List<Recruitment>) repo.findAll();
	}
	
	//update Recruitment//
	public Recruitment updateRecruitment(String id, Recruitment upadtedRecruitment) {
		
		Optional<Recruitment> e = repo.findById(id);
		if(e.isPresent()){
			Recruitment existingRecruitment = e.get();
			existingRecruitment.setDeptID(upadtedRecruitment.getDeptID());
			existingRecruitment.setDeptName(upadtedRecruitment.getDeptName());
			existingRecruitment.setMinYearOfExperience(upadtedRecruitment.getMinYearOfExperience());
			existingRecruitment.setNoOfVacancies(upadtedRecruitment.getNoOfVacancies());
			existingRecruitment.setSkillRequired(upadtedRecruitment.getSkillRequired());
			return repo.save(existingRecruitment);
		}
		else 
		{
			throw new EntityNotFoundException("Can't update, entity not found!");
		}
		
	}
	public void deleteRecruitmentByID(String id) {
		Optional<Recruitment> e = repo.findById(id);
		if(e.isPresent()) {
			repo.deleteById(id);
		}else {
			throw new EntityNotFoundException("can't delete , entity not found!");
		}
	}
	
	public Optional<Recruitment> getRecruitmentById(String id) {
		return repo.findById(id);
	}
	

}
