package hw160427;

public class AltPairs {

	public static void main(String[] args) {

		String str = "Chocolate";
		int lengthS = str.length();
		String result = "";
		for (int i = 0; i < lengthS; i += 4) {
			int end = i + 2;
			if (end > str.length()) {
				end = str.length();
			}
			String sub = str.substring(i, end);
			result += sub;
		}
		System.out.println(result);
	}

}
