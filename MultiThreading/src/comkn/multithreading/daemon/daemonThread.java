package comkn.multithreading.daemon;

public class daemonThread {

	public static void main(String[] args) {
// Instantiate Thread Objects
		TypingCode t1=new TypingCode();
		SavingCode t2=new SavingCode();
		CompilingCode t3=new CompilingCode();
		
//		Set thread as Deamon Thread
		t2.setDaemon(true);
		t3.setDaemon(true);
		
//	Start all Thread
		t1.start();
		t2.start();
		t3.start();
	
		
	}

}
