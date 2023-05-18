package codingbat._05102023;

public class Array123 {
	public static boolean array123(int[] nums) {
		boolean a = false;

		if (nums.length < 3) {
			return false;
		} else {
			for (int i = 0; i < nums.length - 2; i++) {

				if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
					a = true;
				}

			}
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(array123(new int[] { 1, 1, 2, 3, 1 }));
	}
}
