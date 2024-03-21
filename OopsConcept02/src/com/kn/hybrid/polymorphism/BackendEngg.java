package com.kn.hybrid.polymorphism;

public class BackendEngg extends SoftwareEngg {
	public void attendMeeting() {
		System.out.println("Backend Engg Attending BackEnd Meeting");
	}

//	Child Specific Method
	public void doBackendProject() {
		System.out.println("Backend Engg working on the Backend Project");
	}
}
