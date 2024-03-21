package comkn.multithreading6;

public class MyThread extends Thread {

	@Override
	public void run() {
		if (Thread.currentThread().getName().equalsIgnoreCase("Numbers")) {
			PrintNumbers();
		} else {
			PrintCharacters();
		}
	}
	private void PrintNumbers() {
		System.out.println("Printing Numbers started");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Printing Numbers ended");
	}

	private void PrintCharacters() {

		System.out.println("Printing Characters started");
		for (int i = 65; i <= 74; i++) {
			System.out.println((char)(i));
		}
		System.out.println("Printing Characters started");

	}

}
