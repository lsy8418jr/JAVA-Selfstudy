package _2023._06262023;

interface NumericFunc {
	int func(int n);
}

public class BlockLamda {
	public static void main(String[] args) {
		NumericFunc factorial = (n) -> {
			int result = 1;

			for (int i = 1; i <= n; i++) {
				result = i * result;
			}
			return result;
		};

		System.out.println("the factorial fo 3 is " + factorial.func(3));
	}
}
