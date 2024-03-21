package comkn.multithreading6;



public class ThreadDemo1 {

	public static void main(String[] args) {

		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		t1.setName("Numbers");
		t2.setName("Characters");
		
		t1.start();
		t2.start();
	}

}
