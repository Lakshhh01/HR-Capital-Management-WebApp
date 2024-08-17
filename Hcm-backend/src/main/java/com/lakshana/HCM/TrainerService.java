//package com.lakshana.HCM;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import jakarta.persistence.EntityNotFoundException;
//
//
//@Service
//public class TrainerService {
//
//	@Autowired
//	TrainerRepository repo;
//	
//	//create Trainer//
//	public Trainer createTrainer(Trainer emp) {
//		return repo.save(emp);
//	}
//	
//	//display all Trainers//
//	public List<Trainer> getAllTrainer(){
//		return (List<Trainer>) repo.findAll();
//	}
//	
//	//update Trainer//
//	public Trainer updateTrainer(int id, Trainer upadtedTrainer) {
//		
//		Optional<Trainer> e = repo.findById(id);
//		if(e.isPresent()){
//			Trainer existingTrainer = e.get();
//			existingTrainer.setTrainerName(upadtedTrainer.getTrainerName());
//			existingTrainer.setTrainingAnalysis(upadtedTrainer.getTrainingAnalysis());
//			return repo.save(existingTrainer);
//		}
//		else 
//		{
//			throw new EntityNotFoundException("Can't update, entity not found!");
//		}
//		
//	}
//	public void deleteTrainerByID(int id) {
//		Optional<Trainer> e = repo.findById(id);
//		if(e.isPresent()) {
//			repo.deleteById(id);
//		}else {
//			throw new EntityNotFoundException("can't delete , entity not found!");
//		}
//	}
//	
//	public Optional<Trainer> getTrainerById(int id) {
//		return repo.findById(id);
//	}
//	
//
//}
