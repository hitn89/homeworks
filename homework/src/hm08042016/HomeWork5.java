package hm08042016;

import java.util.Arrays;

public class HomeWork5 {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Usage:  EvenOddExample <number>");
			System.exit(0);
		}

		String argsList = Arrays.toString(args);
		System.out.println(argsList);

		int number = Integer.parseInt(args[0]);

		for (int i = 0; number != 0; i++) {
			if (number % 2 == 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
			number = number >> 1;
		}

	}

}