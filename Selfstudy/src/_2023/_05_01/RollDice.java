package _2023._05_01;

import java.util.Random;

public class RollDice {
	Random rand = new Random();
	int num = 0;

	public RollDice() {

		roll();

	}

	void roll() {
		num = rand.nextInt(6) + 1;
		System.out.println(num);
	}

	public static void main(String[] args) {
		RollDice dice1 = new RollDice();
	}
}
