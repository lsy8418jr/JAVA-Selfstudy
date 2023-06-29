package _2023._06262023;

interface MyFuncInter {
	void method(int x);
}

public class LamdaDemo4 {
	public static void main(String[] args) {
		MyFuncInter fi;

		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);

		fi = (x) -> {
			System.out.println(x * 5);
		};
		fi.method(3);

		fi = (x) -> {
			System.out.println(x * 5);

		};
		fi.method(4);

		fi = x -> System.out.println(x * 5);
		fi.method(5);

	}
}