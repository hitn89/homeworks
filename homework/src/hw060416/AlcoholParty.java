package hw060416;

import java.util.Arrays;

public class AlcoholParty {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage:  EvenOddExample <number>");
			System.exit(0);
		}

		String argsList = Arrays.toString(args);
		System.out.println(argsList);

		int x = Integer.parseInt(args[0]);

		if (x == 2) {
			System.out.println("�����!!");
		}
		if (x == 5) {
			System.out.println("����!!!");
		}
		if (x == 1) {
			System.out.println("� ����� ���.");
		}
		if (x != 2 && x != 5 && x != 1) {
			System.out.println("Fatal ERROR!");
		}
	}

}
