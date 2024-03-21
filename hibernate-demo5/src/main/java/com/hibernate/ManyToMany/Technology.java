package com.hibernate.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Technology {

	@Id
	int Tech_id;
	String Tech_Name;

	@ManyToMany
	List<Employee> employees;

	public Technology() {
		super();
	}

	public Technology(int tech_id, String tech_Name, List<Employee> employees) {
		super();
		Tech_id = tech_id;
		Tech_Name = tech_Name;
		this.employees = employees;
	}

	public int getTech_id() {
		return Tech_id;
	}

	public void setTech_id(int tech_id) {
		Tech_id = tech_id;
	}

	public String getTech_Name() {
		return Tech_Name;
	}

	public void setTech_Name(String tech_Name) {
		Tech_Name = tech_Name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Technology [Tech_id=" + Tech_id + ", Tech_Name=" + Tech_Name + ", employees=" + employees + "]";
	}
}
