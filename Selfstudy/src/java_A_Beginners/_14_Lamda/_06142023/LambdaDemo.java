package java_A_Beginners._14_Lamda._06142023;

interface MyValue {
	double getValue();
}

interface MyParamValue {
	double getValue(double v);
}

public class LambdaDemo {
	public static void main(String[] args) {

		MyValue myVal;
		myVal = () -> 98.6;
		System.out.println("a constant value : " + myVal.getValue());

		MyParamValue myPVal;
		myPVal = (n) -> 1.0 / n;
		System.out.println("reciprocal of 4 is :" + myPVal.getValue(4));
		System.out.println("reciprocal of 5 is :" + myPVal.getValue(5));

	}
}
