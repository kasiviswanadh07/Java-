package com.example.demo.entity;

public class Laptop {
  
	String serialNumber;
	String manufacturer;
	int cost;
	
	public Laptop() {
		super();
	}

	public Laptop(String serialNumber, String manufacturer, int cost) {
		super();
		this.serialNumber = serialNumber;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
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
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Laptop [serialNumber=" + serialNumber + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}
	 
	
}
