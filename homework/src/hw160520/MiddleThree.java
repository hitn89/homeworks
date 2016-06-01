package hw160520;

public class MiddleThree {

	public static void main(String[] args) {

		String hren = middleThree("Candy");
		System.out.println(hren);

	}

	public static String middleThree(String str) {
		int length = str.length();
		if (length > 3) {
			int fif = length / 2;
			return str.substring(fif - 1, fif + 2);
		} else {
			return str;
		}
	}

}
