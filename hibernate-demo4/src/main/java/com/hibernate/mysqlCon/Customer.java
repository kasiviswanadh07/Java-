package com.hibernate.mysqlCon;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	int customer_Id;
	String customer_Name;
	int Customer_Age;
	
	@OneToMany
	List <Product> products;

	public Customer() {
		super();
	}

	public Customer(int customer_Id, String customer_Name, int customer_Age, List<Product> products) {
		super();
		this.customer_Id = customer_Id;
		this.customer_Name = customer_Name;
		Customer_Age = customer_Age;
		this.products = products;
	}

	public int getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}

	public String getCustomer_Name() {
		return customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public int getCustomer_Age() {
		return Customer_Age;
	}

	public void setCustomer_Age(int customer_Age) {
		Customer_Age = customer_Age;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [customer_Id=" + customer_Id + ", customer_Name=" + customer_Name + ", Customer_Age="
				+ Customer_Age + ", products=" + products + "]";
	}

}
