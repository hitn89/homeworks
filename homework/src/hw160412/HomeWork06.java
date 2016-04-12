package hw160412;

public class HomeWork06 {

	public static void main(String[] args) {

		int[][][] matrix = { 
				{ { 1, 0, 3 }, { 4, 0, 6 }, { 7, 8, 9 } },
				{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } }, 
				{ { 19, 0, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } 
				};

		OUTER: for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				for (int depth = 0; depth < matrix[column].length; depth++)
					if (matrix[row][column][depth] == 0) {
						System.out.println("\"0\" встречается в строке № " + row);
						continue OUTER;
					}
			}
		}

	}

}
