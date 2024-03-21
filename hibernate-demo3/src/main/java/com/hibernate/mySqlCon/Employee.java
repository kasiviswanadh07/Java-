package com.hibernate.mySqlCon;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    
	@Id
	int empid;
	String empName;
	int salary;
	
	
	public Employee() {
		super();
	}
	public Employee(int empid, String empName, int salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	
}
