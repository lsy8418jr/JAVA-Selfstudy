package java_A_Beginners._03_Program_Control_Statements._07262023;

public class KbIn {
	public static void main(String[] args) throws java.io.IOException {
		char ch;
		System.out.println("Press a key followed bu ENTER");
		ch = (char) System.in.read(); // read a char
		System.out.println("Your key is : " + ch);

	}
}
