//package com.lakshana.HCM;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToMany;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="trainer")
//public class Trainer {
//
//    @Column(name="trainer_name")
//    String trainerName;
//
//    @Id
//    @Column(name="trainer_id")
//    int id;
//
//    @ManyToOne
//    @JoinColumn(name="training_id", referencedColumnName = "training_id")
//    TrainingAnalysis trainingAnalysis;
//
//    public Trainer() {
//        // Default constructor
//    }
//
//    public Trainer(String trainerName, int id, TrainingAnalysis trainingAnalysis) {
//        this.trainerName = trainerName;
//        this.id = id;
//        this.trainingAnalysis = trainingAnalysis;
//    }
//
//	public String getTrainerName() {
//		return trainerName;
//	}
//
//	public void setTrainerName(String trainerName) {
//		this.trainerName = trainerName;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public TrainingAnalysis getTrainingAnalysis() {
//		return trainingAnalysis;
//	}
//
//	public void setTrainingAnalysis(TrainingAnalysis trainingAnalysis) {
//		this.trainingAnalysis = trainingAnalysis;
//	}
//
//    
//	
//
//}
