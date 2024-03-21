package com.kn.interface4;

public interface MyInterface {
//      static variable
	public static final int i=10;
//	static block - Error
//	static {
//	System.out.println("Static block inside interface");
//}
//	instance method - error
//	public void m3(){
//}
//	constructor - error
//	public MyInterface (){
//}
	
//	instance block - error
//	{
//		
//	}
	public static void main(String []args) {
		System.out.println("main() method from interface");	
	}
//   default method allowed java 8 onwards
	public default void m6(){
		System.out.println("Default method from interface");
	}
//	final method - error
//	public static final void m4(){
//}
//    private method java 9 onwards
	private void m5() {
		
	}	
}
