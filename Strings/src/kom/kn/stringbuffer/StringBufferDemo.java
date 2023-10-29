package kom.kn.stringbuffer;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Ram");
		System.out.println("Data: " + stringBuffer);
		System.out.println("Length: " + stringBuffer.length());
		System.out.println("capacity: " + stringBuffer.capacity());

		System.out.println("*******");
		System.out.println();

		stringBuffer.append("sita");
		stringBuffer.append("sita");
		stringBuffer.append("sita");
		stringBuffer.append("sita");
		stringBuffer.append("sita");

		System.out.println("Data: " + stringBuffer);
		System.out.println("Length: " + stringBuffer.length());
		System.out.println("capacity: " + stringBuffer.capacity());

	}

}
