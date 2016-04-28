package hw160427;

public class Array667 {

	public static void main(String[] args) {

		int[] nums = { 6, 7, 2, 6, 6 };
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums.length > i + 1) {

				if (nums[i] == 6) {
					if (nums[i + 1] == 6 || nums[i + 1] == 7) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
