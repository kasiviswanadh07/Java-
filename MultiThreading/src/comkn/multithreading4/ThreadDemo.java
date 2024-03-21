package comkn.multithreading4;

public class ThreadDemo {

	public static void main(String[] args) {

		PrintNumbers t1=new PrintNumbers();
		t1.start();
		PrintCharacters t2=new PrintCharacters();
		t2.start();
	}

}
