package com.kn.entites;

public class Trainer {
	int id;
	String name;
	double salary;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}