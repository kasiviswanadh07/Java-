package oops;

public class CarApp {

	public static void main(String[] args) {
		Car c1=new Car("hyundai","iuv7","white");
		
		c1.drive();
		c1.honk();
		System.out.println("The car name is "+ c1.name+" and having the model " + c1.model +" and having the color " + c1.color);
	}

}
