package hw160427;

public class NoTriples {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 2, 2, 2, 1 };
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i + 3 <= nums.length) {
				if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
					count++;
				}
			}
		}
		System.out.println(count);
		if (count > 0) {
			System.out.println("есть совподения");
		} else {
			System.out.println("нет совподений");
		}
	}

}
