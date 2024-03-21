package oops;

public class TrainerApp {
	public static void main(String[]args)
	{
     	Trainer t1=new Trainer();
		
		
      	t1.givedata(23,"kasi", 25000,5.7);
		
//		t1.age=23;
//     	t1.height=5.7;
// 		t1.name="kasi viswanadh";
//		t1.salary=25000;
//		
        System.out.println("The trainer Name is  "+ t1.name+", and his Height is"+ t1.height+", and the Age is "+t1.age+", and earning salary"+t1.salary);
		
		t1.teach();
		t1.schold();
		
		
		
        Trainer t2=new Trainer();
        t2.givedata(23,"vijay",27000,5.3);
//		
		t2.age=23;
		t2.height=5.3;
		t2.name="vijay";
		t2.salary=27000;
		
		System.out.println("The trainer Name is  "+ t2.name+", and his Height is"+ t2.height+", and the Age is "+t2.age+", and earning salary"+t2.salary);
		
		t2.teach();
		t2.schold();

		
	}

}
