package java_A_Beginners._06_Class;

public class VarArgs2 {
	
	
	/*
	 * msg is a normal parameter and v is a varargs parameter.
	 */
	static void vaTest(String msg, int...v) {
		System.out.println(msg + v.length);
		System.out.println("Contents: ");
		
		for (int i=0;i<v.length;i++) {
			System.out.println(" arg " + i + ": " + v[i]);
		}
		
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		vaTest("One vararg : ", 10);
		vaTest("Three varargs :", 1,2,3);
		vaTest("no vararg  " );
	}
}
