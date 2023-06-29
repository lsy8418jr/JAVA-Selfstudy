package _2023._2Q._06_23;

class Gen<T> {
	T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
}

public class GenDemo {
	public static void main(String[] args) {
		Gen<String> strOb = new Gen<>();
		strOb.setOb("Hi, this is Scott");
		String str = strOb.getOb();
		System.out.println(str);

		Gen<Integer> intOb = new Gen<>();
		intOb.setOb(25);
		int a = intOb.getOb();
		System.out.println(a);
	}
}
