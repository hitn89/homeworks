package hw160520;

public class WithoutX {

	public static void main(String[] args) {

		String hren = withoutX("x");
		System.out.println(hren);

	}

	public static String withoutX(String str) {
		String result = "";
		int len = str.length();

		if (len > 1) {
			if (str.substring(0, 1).equals("x")) {
				result = str.substring(1, len);
				// System.out.println("1 " + result);
			} else
				result = str;

			if (str.substring(len - 1, len).equals("x")) {
				result = result.substring(0, result.length() - 1);
				// System.out.println("2 " + result);
			}
		}

		return result;
	}

}
