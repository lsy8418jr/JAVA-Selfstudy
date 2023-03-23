package javaABeginners.chap8;

interface MyMath {
	void math1();

	void math2();
}

interface MyMath3 extends MyMath {
	void math3();
}

//This class must implement all of MyMath and MyMath3
class MyClass implements MyMath3 {
	public void math1() {
		System.out.println("Implement math1().");
	}

	public void math2() {
		System.out.println("Implement math2().");
	}

	public void math3() {
		System.out.println("Implement math3().");
	}
}

public class IFExtend {
public static void main(String[] args) {
	MyClass ob=new MyClass();
	ob.math1();
	ob.math2();
	ob.math3();
	
}
}
