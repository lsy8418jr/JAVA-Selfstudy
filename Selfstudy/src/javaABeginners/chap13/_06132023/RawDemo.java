package javaABeginners.chap13._06132023;

class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	T getOb() {
		return ob;
	}
}

public class RawDemo {
	public static void main(String[] args) {
		Gen<Integer> ob = new Gen<Integer>(88);
		Gen<String> strob = new Gen<String>("generic");

//create a raw-type Gen object and give it a Double value
		Gen raw = new Gen(new Double(98.6));

		double d = (double) raw.getOb();
		System.out.println("value : " + d);

	}
}
