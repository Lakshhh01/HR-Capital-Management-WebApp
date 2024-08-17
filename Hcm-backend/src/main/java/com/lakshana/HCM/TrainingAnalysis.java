//package com.lakshana.HCM;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table(name="training_Analysis_employees")
//public class TrainingAnalysis {
//
//    @Id
//    @Column(name="training_id")
//    String trainingId;
//
//    @Column(name="Training_skill_name")
//    String trainingSkillName;
//
//    @Column(name="duration_in_days")
//    int durationInDays;
//
//    @Column(name="schedule")
//    String schedule;
//
//    @Column(name="result")
//    String result;
//
//    @Column(name="attendance")
//    double attendance;
//
//    @ManyToOne
//    @JoinColumn(name="id", referencedColumnName = "id")
//    Employee employee;
//
//    @ManyToOne
//    @JoinColumn(name="trainer_id", referencedColumnName = "trainer_id")
//    Trainer trainer;
//
//    public TrainingAnalysis() {
//        // Default constructor
//    }
//
//    public TrainingAnalysis(String trainingId, String trainingSkillName, int durationInDays, String schedule,
//                            String result, double attendance, Employee employee, Trainer trainer) {
//        this.trainingId = trainingId;
//        this.trainingSkillName = trainingSkillName;
//        this.durationInDays = durationInDays;
//        this.schedule = schedule;
//        this.result = result;
//        this.attendance = attendance;
//        this.employee = employee;
//        this.trainer = trainer;
//    }
//
//	public String getTrainingId() {
//		return trainingId;
//	}
//
//	public void setTrainingId(String newtrainingId) {
//		trainingId = newtrainingId;
//	}
//
//	public String getTrainingSkillName() {
//		return trainingSkillName;
//	}
//
//	public void setTrainingSkillName(String trainingSkillName) {
//		this.trainingSkillName = trainingSkillName;
//	}
//
//	public int getDurationInDays() {
//		return durationInDays;
//	}
//
//	public void setDurationInDays(int durationInDays) {
//		this.durationInDays = durationInDays;
//	}
//
//	public String getSchedule() {
//		return schedule;
//	}
//
//	public void setSchedule(String schedule) {
//		this.schedule = schedule;
//	}
//
//	public String getResult() {
//		return result;
//	}
//
//	public void setResult(String result) {
//		this.result = result;
//	}
//
//	public double getAttendance() {
//		return attendance;
//	}
//
//	public void setAttendance(double attendance) {
//		this.attendance = attendance;
//	}
//
//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//
//	public Trainer getTrainer() {
//		return trainer;
//	}
//
//	public void setTrainer(Trainer trainer) {
//		this.trainer = trainer;
//	}
//
//	
//}
