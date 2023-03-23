package javaABeginners.chap6;

class Overload {
	void ovlDemo() {
		System.out.println("No parameter");
	}

	void ovlDemo(int a) {
		System.out.println("one parameter  " + a);
	}

	int ovlDemo(int a, int b) {
		System.out.println("Two parameter  " + a + " " + b);
		return a + b;
	}

	double ovlDemo(double a, double b) {
		System.out.println("two double  " + a + " " + b);
		return a + b;
	}

}

public class OverloadDemo {
public static void main(String[] args) {
	Overload ob= new Overload();
	int resI;
	double resD;
	
	
	ob.ovlDemo();
	ob.ovlDemo(2);
	System.out.println("two int adding : "+ob.ovlDemo(3, 6));
	System.out.println(ob.ovlDemo(1.1, 3.56));
}
}
