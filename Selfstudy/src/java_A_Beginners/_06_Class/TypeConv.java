package java_A_Beginners._06_Class;

class Overload2 {
	void f(int x) {
		System.out.println("inside f(int) : " + x);
	}

	void f(double x) {
		System.out.println("inside f(double):  " + x);
	}

}

public class TypeConv {
	public static void main(String[] args) {
		Overload2 ob = new Overload2();
		int i = 10;
		double d = 10.1;
		byte b = 99;
		short s = 10;
		float f = 11.4F;

		ob.f(i);
		ob.f(d);

		ob.f(b); // – type conversion
		ob.f(s); // – type conversion
		ob.f(f); // – type conversion
	}
}
