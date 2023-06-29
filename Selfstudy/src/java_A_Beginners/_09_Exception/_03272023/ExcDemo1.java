package java_A_Beginners._09_Exception._03272023;

public class ExcDemo1 {
	public static void main(String[] args) {
		int nums[] = new int[4];

		try {
			System.out.println("Before exception is generated.\n");
			// generate an index out-of-bound exception
			nums[7] = 10;
			System.out.println("this won't be displayed");
		}

		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println(("index out-of-bound\n"));
		}
		System.out.println("After catch statement.");
	}
}
