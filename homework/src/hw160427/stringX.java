package hw160427;

public class stringX {

	public static void main(String[] args) {

		String str = "xabxxxcdx";

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
				result += str.substring(i, i + 1);
			}

		}
		System.out.println(result);
	}

}
