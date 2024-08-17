//package com.lakshana.HCM;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import jakarta.persistence.EntityNotFoundException;
//
//@RestController
//public class TrainingAnalysisController {
//
//	@Autowired
//	TrainingAnalysisService service;
//	
//	//create//
//	
//	@PostMapping("/trainingAnalysis/create/{TrainingAnalysis}")
//	public String createTrainingAnalysis(@RequestBody TrainingAnalysis ta) {
//		TrainingAnalysis taObject=service.createTrainingAnalysis(ta);
//		if(taObject!=null) {
//			return "Successfull created Trainign Analysis!";
//		}else {
//			return "Failed to create Trainign Analysis!";
//		}
//	}
//	
//	//display//
//	@GetMapping("/trainingAnalysis")
//	public List<TrainingAnalysis> getAll(){
//		return service.getAllRows();
//	}
//	
//	//display//
//	@GetMapping("/trainingAnalysis/getById/{id}")
//	public Optional<TrainingAnalysis> getById(@PathVariable String id){
//		return service.getById(id);
//	}
//	
//	//upadte//
//	
//	@PutMapping("/trainingAnalysis/update/{id}")
//	public TrainingAnalysis updateTrainingAnalysis(@PathVariable String id,@RequestBody TrainingAnalysis ta) {
//		return service.updateTrainingAnalysis(id, ta);
//	}
//	
//	//delete//
//	@DeleteMapping("/trainingAnalysis/delete/{id}")
//	public String deleteTrainingAnalysis(@PathVariable String id) {
//		
//		try {
//			
//			service.deleteTraningAnalysis(id);
//			return "successfully deleted Trainer with id: "+id;
//			
//		}catch(EntityNotFoundException e) {
//			 return "failed !! Trainer not found! with id: "+id;
//			}
//	}
//
//}
