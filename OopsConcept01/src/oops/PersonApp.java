package oops;

public class PersonApp {
	public static void main(String[] args) {
		Person M1=new Person();
		System.out.println("Name="+M1.name+", Bloodgroup="+M1.bloodgroup+",Height="+M1.height+",Age="+M1.age+", Color="+M1.color);
		
		M1.name="kasi viswanadh";
		M1.bloodgroup='c';
		M1.height=5.8;
		M1.age=23;
		M1.color="white";
		M1.swimming();
		M1.flirting();
		M1.listening();
	    System.out.println("Name="+M1.name+", Bloodgroup="+M1.bloodgroup+", Height="+M1.height+", Age="+M1.age+", Color="+M1.color);
	}

}
