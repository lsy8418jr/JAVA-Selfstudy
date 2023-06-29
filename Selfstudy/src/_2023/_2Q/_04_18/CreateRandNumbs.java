package _2023._2Q._04_18;

import java.util.*;

public class CreateRandNumbs {
	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			 int num = rand.nextInt(6) + 1; // dice numbers

			// double num=rand.nextDouble();
			//boolean num = rand.nextBoolean();

			System.out.println(num);
		}

	}
}
