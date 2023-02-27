package JavaABeginners.chap6;

class StaticBlock {

	static double rootOf3;
	static double rootOf2;

	
	/*
	 * This block is executed when the class is loaded.
	 */
	
	static {
		System.out.println("inside static block");
		rootOf2 = Math.sqrt(2.0);
		rootOf3 = Math.sqrt(3.0);

	}

	StaticBlock(String msg) {
		System.out.println(msg);
	}

}

public class SDemo3 {

	public static void main(String[] args) {

		StaticBlock ob = new StaticBlock("inside constructor	");
		System.out.println("Square root of 2 is " + StaticBlock.rootOf2);
		System.out.println("Square root of 3 is " + StaticBlock.rootOf3);

	}

}
