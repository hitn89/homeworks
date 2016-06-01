package hw160520;

public class FirstLast6 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 6 };
		int len = nums.length;
		System.out.println(nums[0]);
		System.out.println(nums[len - 1]);
		if ((nums[0] == 6) || (nums[3] == 6)) {
			System.out.println("true");
		} else
			System.out.println("false");
	}
}