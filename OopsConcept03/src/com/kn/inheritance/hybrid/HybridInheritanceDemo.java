package com.kn.inheritance.hybrid;

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		EnggStudent e1 = new EnggStudent();
		e1.name = "Kasi";
		System.out.println("EnggStudent Name: " + e1.name);
		e1.Student();

		System.out.println();
		MedicalStudent m1 = new MedicalStudent();
		m1.name = "Vinay";
		System.out.println("MedicalStudent Name: " + m1.name);
		m1.MediStudent();

		System.out.println();
		JavaTrainer t1 = new JavaTrainer();
		t1.name = "Yogi";
		System.out.println("JavaTrainer Name: " + t1.name);
		t1.Teach();

		System.out.println();
		SqlTrainer s1 = new SqlTrainer();
		s1.name = "Kishore";
		System.out.println("SQLTrainer Name: " + s1.name);
		s1.Teach();

	}

}
