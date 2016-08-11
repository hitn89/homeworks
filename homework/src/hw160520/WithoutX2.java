package hw160520;

public class WithoutX2 {

	public static void main(String[] args) {

		String hren = withoutX2("xmxnd");
		System.out.println(hren);

	}

	public static String withoutX2(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			String bukva = str.substring(i, i + 1);
			if (((i == 0) || (i == 1)) && (bukva.equals("x"))) {
			} else {
				result += bukva;
			}
		}
		return result;
	}

}
