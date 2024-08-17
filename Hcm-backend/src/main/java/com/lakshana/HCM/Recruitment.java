package com.lakshana.HCM;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name="recruitment")
public class Recruitment {

	@Id
	@Column(name="recruitmentid")
	String recruitmentId;
	@Column(name="vacancies")
	int noOfVacancies;
	@Column(name="skillsrequired")
	String skillRequired;
	@Column(name="yearsofexperience")
	int minYearOfExperience;
	@Column(name="deptid")
	long deptID;
	@Column(name="deptname")
	String deptName;
	
//	@ManyToOne
//	@JsonBackReference
//    @JoinColumn(name="deptid", referencedColumnName = "deptid")
//    Department department;
//	
	
	public Recruitment() {
		// TODO Auto-generated constructor stub
	}

	
	public Recruitment(String recruitmentId, int noOfVacancies, String skillRequired, int minYearOfExperience,
			long deptID,String deptname) {
		super();
		this.recruitmentId = recruitmentId;
		this.noOfVacancies = noOfVacancies;
		this.skillRequired = skillRequired;
		this.minYearOfExperience = minYearOfExperience;
		this.deptID = deptID;
		this.deptName=deptname;
	}


	public String getRecruitmentId() {
		return recruitmentId;
	}


	public void setRecruitmentId(String recruitmentId) {
		this.recruitmentId = recruitmentId;
	}


	public int getNoOfVacancies() {
		return noOfVacancies;
	}


	public void setNoOfVacancies(int noOfVacancies) {
		this.noOfVacancies = noOfVacancies;
	}


	public String getSkillRequired() {
		return skillRequired;
	}


	public void setSkillRequired(String skillRequired) {
		this.skillRequired = skillRequired;
	}


	public int getMinYearOfExperience() {
		return minYearOfExperience;
	}


	public void setMinYearOfExperience(int minYearOfExperience) {
		this.minYearOfExperience = minYearOfExperience;
	}
	

	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public long getDeptID() {
		return deptID;
	}


	public void setDeptID(long deptID) {
		this.deptID = deptID;
	}


	@Override
	public String toString() {
		return "Recruitment [recruitmentId=" + recruitmentId + ", noOfVacancies=" + noOfVacancies + ", skillRequired="
				+ skillRequired + ", minYearOfExperience=" + minYearOfExperience + ", deptID=" + deptID + ", deptName="
				+ deptName + "]";
	}

	
	
	
	

}
