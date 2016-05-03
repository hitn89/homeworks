package hw160502;

import java.util.Arrays;

public class MatrixMaxValue {

	public static void main(String[] args) {

		int[][] a = { { 4, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a[i]);
			System.out.print(Arrays.toString(a[i]));
			for (int j = 0; j < a[i].length; j++) {
				int suf = a[i].length;
				System.out.println("--" + a[suf]);
			}
			System.out.println(i);
			// System.out.println(Arrays.toString(max));
		}

	}

}
