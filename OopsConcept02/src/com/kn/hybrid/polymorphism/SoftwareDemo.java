package com.kn.hybrid.polymorphism;

public class SoftwareDemo {

	public static void main(String[] args) {

//		SoftwareEngg se = new SoftwareEngg();
//		se.attendMeeting();
//		se.doTesting();
//		System.out.println("-----------------------------------");
//		
//		BackendEngg be=new BackendEngg();
////		Overridden Method
//		be.attendMeeting();
//      Inherited Method
//		be.doTesting();
//		Child Specific Method
//		be.doBackendProject();
//		System.out.println("-----------------------------------");
//
//		DatabaseEngg de=new DatabaseEngg();
////		Overridden Method
//		de.attendMeeting();
//	    Inherited Method	
//		de.doTesting();
//		Child Specific Methods
//		de.doDatabaseProject();
//		de.LearnSQL();
//		System.out.println("-----------------------------------");

//		JavaBackendEngg je=new JavaBackendEngg();
//		Overridden Method
//		je.attendMeeting();
//		Inherited Method
//		je.doTesting();
//		Child Specific Method
//		je.doBackendProject();
//		je.learnJava();
//		System.out.println("-----------------------------------");
//		
//		PythonBackendEngg pe=new PythonBackendEngg();
//		Overridden Method 
//		pe.attendMeeting();
//		Inherited Method
//		pe.doTesting();
//		Child Specific Method
//		pe.doBackendProject();
//		pe.learnPython();
//		
//		System.out.println("-----------------------------------");
//		

//		By using DownCasting

//         SoftwareEngg se=new SoftwareEngg();
//         se.attendMeeting();
//         se.doTesting();
//         System.out.println("------------------------------------");
//         
//         se =new BackendEngg();
//         se.attendMeeting();
//         se.doTesting();;
////         DownCasting
//         ((BackendEngg)(se)).doBackendProject();
//         System.out.println("------------------------------------");
//         
//         se=new DatabaseEngg();
//         se.attendMeeting();
//         se.doTesting();
////         DownCasting
//         ((DatabaseEngg)(se)).doDatabaseProject();
//         ((DatabaseEngg)(se)).LearnSQL();
//         System.out.println("-------------------------------------");
//         
//         se=new JavaBackendEngg();
//         se.attendMeeting();
//         se.doTesting();
////       DownCasting
//         ((JavaBackendEngg)se).doBackendProject();
//         ((JavaBackendEngg)se).learnJava();
//         System.out.println("-------------------------------------");
//         
//         se=new PythonBackendEngg();
//         se.attendMeeting();
//         se.doTesting();
////       DownCasting
//         ((PythonBackendEngg)se).doBackendProject();
//         ((PythonBackendEngg)se).learnPython();
//         System.out.println("-------------------------------------");
//         

		SoftwareEngg se = new SoftwareEngg();
		BackendEngg be = new BackendEngg();
		DatabaseEngg de = new DatabaseEngg();
		JavaBackendEngg je = new JavaBackendEngg();
		PythonBackendEngg pe = new PythonBackendEngg();

		doActivity(se);
		System.out.println();
		doActivity(be);
		System.out.println();
		doActivity(de);
		System.out.println();
		doActivity(je);
		System.out.println();
		doActivity(pe);
	}

	private static void doActivity(SoftwareEngg se) {

		se.attendMeeting();
		se.doTesting();
		if (se instanceof DatabaseEngg) {
			((DatabaseEngg) se).doDatabaseProject();
			((DatabaseEngg) se).LearnSQL();
		} else if (se instanceof JavaBackendEngg) {
			((JavaBackendEngg) se).doBackendProject();
			((JavaBackendEngg) se).learnJava();
		} else if (se instanceof PythonBackendEngg) {
			((PythonBackendEngg) se).doBackendProject();
			((PythonBackendEngg) se).learnPython();
		}
		else if(se instanceof BackendEngg) {
			((BackendEngg) se).doBackendProject();
		}
	}
}
