//package com.lakshana.HCM;
//
//import java.lang.StackWalker.Option;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import jakarta.persistence.EntityNotFoundException;
//
//@Service
//public class TrainingAnalysisService {
//
//	@Autowired
//	TrainingAnalysisRepository repo;
//	
//	
//	
//	//create//
//	public TrainingAnalysis createTrainingAnalysis(@RequestBody TrainingAnalysis ta) {
//		return repo.save(ta);
//	}
//	
//	//display//
//	public List<TrainingAnalysis> getAllRows(){
//		return (List<TrainingAnalysis>) repo.findAll();
//	}
//	
//	//update//
//	public TrainingAnalysis updateTrainingAnalysis(String id,TrainingAnalysis updatedTrainingAnalysis) {
//		Optional<TrainingAnalysis> ta=repo.findById(id);
//		if(ta.isPresent()) {
//			TrainingAnalysis existing_TA=ta.get();
//			existing_TA.setAttendance(updatedTrainingAnalysis.getAttendance());
//			existing_TA.setDurationInDays(updatedTrainingAnalysis.getDurationInDays());
//			existing_TA.setEmployee(updatedTrainingAnalysis.getEmployee());
//			existing_TA.setResult(updatedTrainingAnalysis.getResult());
//			existing_TA.setSchedule(updatedTrainingAnalysis.getSchedule());
//			existing_TA.setTrainer(updatedTrainingAnalysis.getTrainer());
//			existing_TA.setTrainingSkillName(updatedTrainingAnalysis.getTrainingSkillName());
//			return repo.save(existing_TA);
//			
//		}else {
//			throw new EntityNotFoundException("can't update, entity not found!");
//		}
//	}
//	
//	//delete//
//	public void deleteTraningAnalysis(String id) {
//		Optional <TrainingAnalysis> ta =repo.findById(id);
//		if(ta.isPresent()) {
//			repo.deleteById(id);
//		}else {
//			throw new EntityNotFoundException("can't delete, entity not found!");
//		}
//	}
//		
//	//display//
//		public Optional<TrainingAnalysis> getById(String id){
//			return repo.findById(id);
//		}
//
//}
