package hw160520;

public class ConCat {

	public static void main(String[] args) {

		String res = conCat("dog", "cat");
		System.out.println(res);

	}

	public static String conCat(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();

		String result = "";
		String obrA = "";
		if (lenA > 0) {
			obrA = a.substring(lenA - 1, lenA); // obrA = g
			result = a;
		} else {
			result = a; // result = dog
		}
		if (lenB > 0) {
			String obrB = b.substring(0, 1); // obrB = c
			if (obrA.equals(obrB)) {
				result = a.substring(0, lenA - 1) + b;
			} else {
				result += b;
			}
		} else {
			result += b;
		}

		return result;

	}

}
