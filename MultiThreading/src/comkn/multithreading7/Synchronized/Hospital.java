package comkn.multithreading7.Synchronized;

public class Hospital {
public static void main(String[] args) {
//	Hospital h=new Hospital();
//	Treatment tom=new Treatment(h);
//	Treatment jerry=new Treatment(h);
//	Thread t1=new Thread(tom);
//	Thread t2=new Thread(jerry);
	
	Treatment treatment=new Treatment();
	
	Thread t1=new Thread(treatment);
	Thread t2=new Thread(treatment);
	
	t1.setName("Tom");
	t2.setName("Jerry");
	
	t1.start();
	t2.start();
}
}
