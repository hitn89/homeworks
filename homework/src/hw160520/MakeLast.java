package hw160520;

public class MakeLast {

	public static void main(String[] args) {

		int[] nums = { 2, 3 };

		int leng = nums.length;
		int[] result = new int[leng * 2];
		int lengR = result.length;
		result[lengR] = nums[leng - 1];
		return;

	}

}
