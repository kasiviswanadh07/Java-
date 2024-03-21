package com.example.demo.entity;


public class Mobile {

    String imeiNumber;
    String model;
    double cost;
     
	public Mobile() {
		super();
	}

	public Mobile(String imeiNumber, String model, double cost) {
		super();
		this.imeiNumber = imeiNumber;
		this.model = model;
		this.cost = cost;
	}

	/**
	 * @return the imeiNumber
	 */
	public String getImeiNumber() {
		return imeiNumber;
	}

	/**
	 * @param imeiNumber the imeiNumber to set
	 */
	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
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
		return "Mobile [imeiNumber=" + imeiNumber + ", model=" + model + ", cost=" + cost + "]";
	} 
    
}
