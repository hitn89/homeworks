package hw160520;

public class TheEnd {

	public static void main(String[] args) {

		String hren = theEnd("He", false);
		System.out.println(hren);

	}

	public static String theEnd(String str, boolean front) {
		int length = str.length();
		if (front == true) {
			return str.substring(0, 1);
		}
		if (front == false) {
			return str.substring(length - 1, length);
		}

		return str;
	}

}
