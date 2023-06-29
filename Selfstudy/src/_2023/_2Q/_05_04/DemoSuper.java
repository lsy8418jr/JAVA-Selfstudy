package _2023._2Q._05_04;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name+" "+ age;		
	}
}

class Hero extends Person {
	String power;

	Hero(String name, int age, String power) {
		super(name, age);
		this.power = power;

	}
	public String toStirng() {
		return super.toString()+" "+this.power;
	}
	

	
}

public class DemoSuper {
	public static void main(String[] args) {
		Hero h1 = new Hero("Superman", 36, "bullerproof");
	

		System.out.println(h1.toStirng());
	}
}
