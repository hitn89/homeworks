package hw160520;

public class Fix23 {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 1 };
		int[] result = new int[3];

		for (int i = 0; i < nums.length; i++) {

			int dop = 1;
			if (i < 1) {
				dop = 0;
			}

			if ((nums[i] == 3) && (nums[i - dop] == 2)) {
				result[i] = 0;
			} else {
				result[i] = nums[i];
			}

			System.out.println(result[i] + "  " + nums[i]);
		}

	}

}