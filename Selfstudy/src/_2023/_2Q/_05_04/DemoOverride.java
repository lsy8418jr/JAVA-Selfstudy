package _2023._2Q._05_04;

class Animal {
	void sound() {
		System.out.println("the animal make sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("the dog makes sound ");
	}
}

public class DemoOverride {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.sound();

		Dog d1 = new Dog();
		d1.sound();
	}
}
