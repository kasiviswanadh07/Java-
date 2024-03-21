package com.kn.hybrid.polymorphism;

public class DatabaseEngg extends SoftwareEngg {
	@Override
	public void attendMeeting() {
		System.out.println("DataBaseEngg is Attending Database Meeting");
	}

//  Child Specific Method
	public void doDatabaseProject() {
		System.out.println("Database engg working on the Database Project");
	}

//   Child Specific Method
	public void LearnSQL() {
		System.out.println("Database engineer is learning sql");
	}
}
