package _2023._06_23;

class Stats<T extends Number> {
	T[] num;

	public Stats(T[] t) {
		num = t;
	}

	double average() {
		double sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i].doubleValue();
		}
		return sum / num.length;
	}

}

public class BoundsDemo {
	public static void main(String[] args) {
		Integer num[] = { 1, 2, 3, 4, 5 };
		Stats<Integer> iob = new Stats<>(num);
		double v = iob.average();
		System.out.println("Integer average is " + v);

		Double dnum[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> dOb = new Stats<>(dnum);
		double d = dOb.average();
		System.out.println("dob average is " + d);
	}
}
