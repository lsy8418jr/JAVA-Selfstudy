package Selftaught._06232023;

public class GenMethodDemo {

	public static <T> Gen<T> boxing(T t) {
		Gen<T> box = new Gen<>();
		box.setOb(t);
		return box;
	}

	public static void main(String[] args) {
		Gen<Integer> intOb = boxing(100);

		int i = intOb.getOb();
		System.out.println(i);

		Gen<String> strOb = boxing("Hi this is Soctt");
		String str = strOb.getOb();

		System.out.println(str);

	}
}