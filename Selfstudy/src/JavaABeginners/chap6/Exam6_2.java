package JavaABeginners.chap6;

//
//Given this class,
//
//class Test {
//int a;
//Test(int i) { a = i; }
//}
//
//write a method called swap( ) that exchanges the contents of the objects referred to by two
//Test object references.

class Ttest {
	int a;

	Ttest(int i) {
		a = i;
	}

	static void swap(Ttest ob1, Ttest ob2) {
		int temp;
		temp = ob1.a;
		ob1.a = ob2.a;
		ob2.a = temp;
	}

}

public class Exam6_2 {

	public static void main(String[] args) {

		Ttest num1 = new Ttest(3);
		Ttest num2 = new Ttest(10);
		System.out.println("before num1 : " + num1.a);
		System.out.println("before num2 : " + num2.a);

		Ttest.swap(num1, num2);
		System.out.println("after num1 : " + num1.a);
		System.out.println("after num2 : " + num2.a);
	}

}
