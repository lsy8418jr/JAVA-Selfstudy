package _2023._2Q._05_10;

import java.util.Scanner;

class Animal {
	public void speak() {
		System.out.println("the animals goes brrr");
	}
}

class Dog extends Animal {
	@Override
	public void speak() {
		System.out.println("the dog goes bark");
	}
}

class Cat extends Animal {
	@Override
	public void speak() {
		System.out.println("the cat goes meow");
	}
}

public class DynamicPolymor {
	public static void main(String[] args) {
		Animal animalOb;
		int choice;

		Scanner input = new Scanner(System.in);
		System.out.println("->1: dog");
		System.out.println("->2: cat");
		System.out.print("Please choose an animal :");
		choice = input.nextInt();

		if (choice == 1) {
			animalOb = new Dog();
			animalOb.speak();
		} else if (choice == 2) {
			animalOb = new Cat();
			animalOb.speak();
		} else {
			System.out.println("invalid option");
		}

	}
}
