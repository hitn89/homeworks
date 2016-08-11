package hw160520;

public class HasBad {

	public static void main(String[] args) {

		boolean hren = hasBad("xba");
		System.out.println(hren);

	}

	public static boolean hasBad(String str) {
		int length = str.length();
		if (length > 3) {
			if ((str.substring(0, 3).equals("bad")) || (str.substring(1, 4).equals("bad"))) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}

}
