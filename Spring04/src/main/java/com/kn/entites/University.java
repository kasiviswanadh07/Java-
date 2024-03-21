package com.kn.entites;

public class University {
     int id;
     String name;
     Trainer trainer;
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	public University(int id, String name, Trainer trainer) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
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
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", trainer=" + trainer + "]";
	}
     
}
