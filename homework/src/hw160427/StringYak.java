package hw160427;

public class StringYak {

	public static void main(String[] args) {

		String str = "pakyaknax";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			int end = i + 3;
			if (end > str.length()) {
				end = str.length();
			}
			if (str.substring(i, end).equals("yak")) {
				i += 2;
			} else {
				result += str.substring(i, i + 1);
			}
		}
		System.out.println(result);
	}

}
