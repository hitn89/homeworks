package Lesson20160704;

public class OuterLabels {

	public static void main(String[] args) {
		int[][] matrix = { 
				{1,2,3,}, 
				{4,5,6}, 
				{7,8,9},
		};
	
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
				if(matrix[i][j] >= 5){
					break;
				}
			}
			System.out.println("");
		}
		
	}

}
