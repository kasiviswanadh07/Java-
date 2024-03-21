package com.hiberanate.mysqlCon;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Bike {
	
	@Id
    int regNumber;
    String model;
    int cost;   
    @OneToOne
    Student student;
    
   
	public Bike() {
		super();
	}
	public Bike(int regNumber, String model, int cost,Student student) {
		super();
		this.regNumber = regNumber;
		this.model = model;
		this.cost = cost;
		this.student=student;
	}
	
	public Bike(int regNumber) {
		super();
		this.regNumber = regNumber;
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setid(Student student) {
		this.student = student;
	}
	public void getid(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", model=" + model + ", cost=" + cost + "]";
	}
	
    
}
