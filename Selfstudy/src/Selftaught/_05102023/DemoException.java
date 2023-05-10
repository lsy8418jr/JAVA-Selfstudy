package Selftaught._05102023;

import java.util.*;

public class DemoException {
	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter a  number to divide : ");
			double x = input.nextInt();
			System.out.print("Enter a  number to divide by : ");
			double y = input.nextInt();

			double z = x / y;

			System.out.println("result = " + z);
		} catch (ArithmeticException e) {

			System.out.println("You cannot divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("Please enter a number");
		} catch (Exception e) {
			System.out.println("something went wrong");
		}

	}
}
