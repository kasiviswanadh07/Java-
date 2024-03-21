package com.hibernate.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	int emp_id;
	String emp_name;
	String team;
	
	@ManyToMany
	List<Technology> technologies;

	public Employee() {
		super();
		
	}

	public Employee(int emp_id, String emp_name, String team, List<Technology> technologies) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.team = team;
		this.technologies = technologies;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", team=" + team + ", technologies="
				+ technologies + "]";
	}
	


	
}
