package java_A_Beginners.chap12._06102023;

public class AutoBox {
	public static void main(String[] args) {
		Integer ob = 100; // autobox an int

		int i = ob; // auto unbox
		
		System.out.println(i + " " + ob);
	}
}
