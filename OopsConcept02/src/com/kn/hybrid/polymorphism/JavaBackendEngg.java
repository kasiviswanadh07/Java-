package com.kn.hybrid.polymorphism;

public class JavaBackendEngg extends BackendEngg {

	@Override
	public void doBackendProject() {
		System.out.println("Java Engg working on javabackend project");
	}

//       Child Specific Method
	public void learnJava() {
		System.out.println("Javabackend engg is Learning java FrameWork");
	}
}
