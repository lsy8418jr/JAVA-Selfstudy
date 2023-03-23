package javaABeginners.chap6;

public class VarArgs4 {
	// First version of vaTest( )
	static void vaTest(int... v) {
		System.out.println("vaTest(int ...): " + "Number of args: " + v.length);
		System.out.println("Contents: ");
		for (int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		System.out.println();
	}

//// Second version of vaTest( )
	static void vaTest(boolean... v) {
		System.out.println("vaTest(boolean ...): " + "Number of args: " + v.length);
		System.out.println("Contents: ");
		for (int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		System.out.println();
	}

	static void vaTest(String msg, int... v) {
		System.out.println("vaTest(String, int ...): " + msg + v.length);
		System.out.println("Contents: ");
		for (int i = 0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		System.out.println();
	}
	
	// this code is Ambiguous. It cannot be determined which parameter used.
	/*
	 * static void vaTest(int n, int ... v) { System.out.println("vaTest(int ...): "
	 * + "Number of args: " + v.length); System.out.println("Contents: "); for (int
	 * i = 0; i < v.length; i++) System.out.println(" arg " + i + ": " + v[i]);
	 * System.out.println(); }
	 */
	
	
	public static void main(String[] args) {

		vaTest(1,2,3);
		vaTest(true, false);
		//vaTest();    this is an error : Ambiguous 
		
		
	}

}
