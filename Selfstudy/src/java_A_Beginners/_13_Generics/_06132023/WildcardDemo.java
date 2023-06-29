package java_A_Beginners._13_Generics._06132023;



public class WildcardDemo {
	public static void main(String[] args) {
		NumericFns<Integer> iOb2 = new NumericFns<Integer>(6);
		NumericFns<Double> dOb2 = new NumericFns<Double>(-6.0);
		NumericFns<Long> lOb2 = new NumericFns<Long>(5L);

		if (iOb2.absEqual(dOb2)) {
			System.out.println("absolute values are equal");
		} else {
			System.out.println("they are different\n");
		}

		System.out.println("Testing iOb and lOb.");
		if (iOb2.absEqual(lOb2))
			System.out.println("Absolute values are equal.");
		else
			System.out.println("Absolute values differ.");

	}
}
