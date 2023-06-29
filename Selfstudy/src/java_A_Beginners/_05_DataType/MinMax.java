package java_A_Beginners._05_DataType;

class MinMax {
	public static void main(String args[]) {
	
		int min, max;
		int nums[] = { 99, -10, 100123, 18, -978,5623, 463, -9, 287, 49 };
		min = max = nums[0];
		for (int i = 1; i < 10; i++) {
			if (nums[i] < min)
				min = nums[i];
			if (nums[i] > max)
				max = nums[i];
		}
		System.out.println("min : " + min);
		System.out.println("max : " + max);
	}
}