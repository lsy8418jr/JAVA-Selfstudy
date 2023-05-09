package Selftaught._05092023;

class Rabbit implements Prey {

	@Override
	public void flee() {
		System.out.println("the rabbit is fleeing");
	}
}

class Hawk implements Predator {

	@Override
	public void hunt() {
		System.out.println("the hawk is hunting");

	}
}

class Fish implements Predator, Prey {

	@Override
	public void flee() {
		System.out.println("the small fish is fleeing");
	}

	@Override
	public void hunt() {
		System.out.println("the big fish is hunting");
	}

}

public class DemoInterface {
	public static void main(String[] args) {
		Rabbit rabbit1 = new Rabbit();
		rabbit1.flee();

		Hawk hawk1 = new Hawk();
		hawk1.hunt();

		Fish fish1 = new Fish();
		fish1.flee();
		fish1.hunt();
	}
}
