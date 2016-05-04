package hw160502;

import java.util.Arrays;
import java.util.Random;

public class MatrixMaxValue {

	public static void main(String[] args) {

		int rows = 4;
		int cols = 5;
		int[][] a = new int[rows][cols];

		Random random = new Random();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = random.nextInt(100);
			}
		}

		for (int i = 0; i < a.length; i++) {
			int srav = 0;
			System.out.print(Arrays.toString(a[i]));
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > srav) {
					srav = a[i][j];
				}
			}
			System.out.println(" Максимальное значение - " + srav);

		}
	}

}
