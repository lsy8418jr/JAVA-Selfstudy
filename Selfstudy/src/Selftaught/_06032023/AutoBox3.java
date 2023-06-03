package Selftaught._06032023;

public class AutoBox3 {
	public static void main(String[] args) {
		Integer ob1, ob2;
		int i;

		ob1 = 99;
		System.out.println("original value of ob1 :" + ob1);
		++ob1;
		System.out.println("after ++ : " + ob1);

		ob1 += 10;
		System.out.println("after +10 :" + ob1);

		ob2 = ob1 + ob1 / 2;
		System.out.println("ob2 after expression : " + ob2);
		i = ob1 + ob2;
		System.out.println("i after expression : " + i);
	}
}
