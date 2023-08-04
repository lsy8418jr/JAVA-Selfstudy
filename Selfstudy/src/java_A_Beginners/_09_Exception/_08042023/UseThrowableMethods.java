package java_A_Beginners._09_Exception._08042023;

class ExcTest {
	static void genException() {
		int[] nums = new int[5];
		System.out.println("Before exception is generated\n");

		nums[7] = 10;

	}
}

public class UseThrowableMethods {
	public static void main(String[] args) {
		try {
			ExcTest.genException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Standard msg is : ");
			System.out.println("-------------\n" + e + "\n-------------");
			System.out.println("\nStack trace : ");
			System.out.println("-------------");
			e.printStackTrace();
			System.out.println("-------------");
		}
		System.out.println("\n\nAfter catch statement.");
	}
}
