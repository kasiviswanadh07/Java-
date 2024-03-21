package com.hibernate.mysqlCon;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	int product_Id;
	String product_Name;
	double Product_Cost;
	
	@ManyToOne
	Customer customer;

	public Product() {
		super();
	}

	public Product(int product_Id, String product_Name, double product_Cost, Customer customer) {
		super();
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		Product_Cost = product_Cost;
		this.customer = customer;
	}

	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public double getProduct_Cost() {
		return Product_Cost;
	}

	public void setProduct_Cost(double product_Cost) {
		Product_Cost = product_Cost;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Product [product_Id=" + product_Id + ", product_Name=" + product_Name + ", Product_Cost=" + Product_Cost
				+ ", customer=" + customer + "]";
	}
	
	
	
	
	
}
