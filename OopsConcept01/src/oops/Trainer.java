package oops;

public class Trainer {
	int age;
	String name;
	int salary;
    double height;
    
    void teach() {
    	System.out.println("Trainer teachs you");
    }
    void schold() {
    	System.out.println("Trainer can scholds you");
    }
   void givedata(int age,String name,int salary,double height) {
//    	age =a;
//    	name= b;
//    	salary =c;
//    	height =d;
    	this.age=age;
    	this.name=name;
        this.salary=salary;
        this.height=height;
    }
    
}
