package hw160427;

public class Has271 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 7, 1, 2, 7, 1 };

		for (int i = 0; i < nums.length; i++) {
			if (i + 2 < nums.length) {
				if (nums[i] == 2 && nums[i + 1] == 7 && nums[i + 2] == 1) {
					System.out.println("Есть совподения");
				}
			}
		}

	}

}
