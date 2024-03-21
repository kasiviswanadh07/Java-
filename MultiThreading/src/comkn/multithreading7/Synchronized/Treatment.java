package comkn.multithreading7.Synchronized;

public class Treatment implements Runnable{
//     Hospital h;
//
//     public Treatment(Hospital h) {
//    	 this.h=h;
//     }
	@Override
	synchronized public void run() {
		try {
			System.out.println("Treatment started for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment in-progress for "+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("Treatment completed for "+Thread.currentThread().getName());
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
     
}
