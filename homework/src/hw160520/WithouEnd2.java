package hw160520;

public class WithouEnd2 {

	public static void main(String[] args) {

		String hren = theEnd("abcd");
		System.out.println(hren);

	}

	public static String theEnd(String str) {
		int length = str.length();
		if (length >= 3) {
			return str.substring(1, length - 1);
		} else {
			return "";
		}
	}

}
