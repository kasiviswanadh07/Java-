package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Bike {

	@Id
	String registrationNumber;
	String manufacturer;
	double cost;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(String registrationNumber, String manufacturer, double cost) {
		super();
		this.registrationNumber = registrationNumber;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}
	/**
	 * @return the registrationNumber
	 */
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	/**
	 * @param registrationNumber the registrationNumber to set
	 */
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Bike [registrationNumber=" + registrationNumber + ", manufacturer=" + manufacturer + ", cost=" + cost
				+ "]";
	}

	
}
