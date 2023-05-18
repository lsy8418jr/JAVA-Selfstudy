package codingbat._05182023;

public class NoTriples {
	public boolean noTriples(int[] nums) {
		boolean result = true;

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
				result = false;
			}

		}
		return result;
	}

	public static void main(String[] args) {
		NoTriples ob = new NoTriples();
		// int[] nums= {1, 1, 2, 2, 2, 1};
		System.out.println(ob.noTriples(new int[] { 1, 1, 2, 2, 2, 1 }));
	}
}
