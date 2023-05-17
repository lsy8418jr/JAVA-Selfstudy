package codingbat.warmup_1._05172023;

public class Array667 {
	public int array667(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6 && nums[i + 1] == 6 || nums[i] == 6 && nums[i + 1] == 7) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Array667 ob = new Array667();

		System.out.println(ob.array667(new int[] { 6, 6, 8, 9, 6, 7 }));

		System.out.println(ob.array667(new int[] { 6, 6, 2, 6 }));

	}
}
