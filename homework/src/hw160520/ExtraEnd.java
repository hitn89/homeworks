package hw160520;

public class ExtraEnd {

	public static void main(String[] args) {

		String str = "Hello";
		int length = str.length();
		String result = str.substring(length - 2, length);
		System.out.println(result + result + result);

	}

}
