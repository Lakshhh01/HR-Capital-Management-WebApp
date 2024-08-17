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
//public class TrainerController {
//	
//	@Autowired
//	TrainerService service;
//	
//	//Create//
//		@PostMapping("/Trainers/create/{Trainer}")
//		public String createTrainerMethod(@RequestBody Trainer emp) {
//			Trainer createTrainerObject=service.createTrainer(emp);
//			if(createTrainerObject!=null) {
//				return "TRainer Created successfully";
//			}else {
//				return "Failed! to create trainer..";
//			}
//		}
//		
//		
//		//display all//
//		@GetMapping("/Trainers")
//		public List<Trainer> getAllTrainers(){
//			return service.getAllTrainer();
//		}
//		
//		@GetMapping("/trainer/getById/{id}")
//		public Optional<Trainer> getById(@PathVariable int id){
//			return service.getTrainerById(id);
//		}
//		
//		//update//
//		@PutMapping("/Trainer/updateTrainerByID/{id}")
//		public Trainer updateTrainerMethod(@PathVariable int id, @RequestBody Trainer updatedTrainer) {
//			return service.updateTrainer(id, updatedTrainer);
//		}
//		
//		//delete//
//		@DeleteMapping("/Trainer/deleteTrainer/{id}")
//		public String deleteTrainerMethod(@PathVariable int id) {
//			
//			try {
//				
//				service.deleteTrainerByID(id);
//				return "successfully deleted Trainer with id: "+id;
//				
//			}catch(EntityNotFoundException e) {
//				 return "failed !! Trainer not found! with id: "+id;
//			}
//		}
//
//}
