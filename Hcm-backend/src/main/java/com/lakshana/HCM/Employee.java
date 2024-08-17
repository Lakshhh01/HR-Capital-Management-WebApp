package com.lakshana.HCM;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee")

public class Employee {

	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long empId;  


    @Column(name="name")
    private String empName;

    @Column(name="salary")
    private double salary;

    @Column(name="gender")
    private char gender;

    @Column(name="email")
    private String email;

    @Column(name="dob")
    private String dob;

    @Column(name="address")
    private String address;

    @Column(name="coreskill")
    private String coreskill;
    
    @Column(name="experienceinyears")
    private int experienceInYears;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "deptid", referencedColumnName = "deptid")
    @JsonBackReference
     private Department department;  
    
    
	/*@JsonManagedReference->parent side,
	 *@JsonBackReference ->child side ;are the two that->
	 * handle bidirectional relationships between entities 
	 * in a way that prevents infinite recursion and stack overflow 
	 * errors during JSON serialization and deserialization.
	 */
	

	public Employee() {
		
	}

	public Employee(long empId, String empName, double salary, char gender, String email, String dob, String address,
			 String cs,int experienceInYears, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.gender = gender;
		this.email = email;
		this.dob = dob;
		this.address = address;
		this.coreskill = cs;
		this.experienceInYears = experienceInYears;
		this.department = department;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCoreskill() {
		return coreskill;
	}

	public void setCoreskill(String coreskill) {
		this.coreskill = coreskill;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public int getExperienceInYears() {
		return experienceInYears;
	}

	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", gender=" + gender
				+ ", email=" + email + ", dob=" + dob + ", address=" + address + ", coreskill=" + coreskill
				+ ", experienceInYears=" + experienceInYears + ", department=" + department + "]";
	}

	



}
