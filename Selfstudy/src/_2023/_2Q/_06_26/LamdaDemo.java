package _2023._2Q._06_26;

interface MyNumber {
	double getValue();
}

public class LamdaDemo {
	public static void main(String[] args) {
		MyNumber myNum;

		myNum = () -> 123.45;
		System.out.println("A Fixed value: " + myNum.getValue());

		myNum = () -> Math.random() * 100;

		System.out.println("a random value " + myNum.getValue());
		System.out.println("another random value " + myNum.getValue());

	}
}
