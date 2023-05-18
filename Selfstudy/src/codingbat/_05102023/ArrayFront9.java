package codingbat._05102023;

public class ArrayFront9 {
	public boolean arrayFront9(int[] nums) {
		boolean a = false;
		if (nums.length > 3) {
			for (int i = 0; i < 4; i++) {
				if (nums[i] == 9) {
					a = true;
				}
			}

		} else {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 9) {
					a = true;
				}
			}
		}
		return a;
	}

}
