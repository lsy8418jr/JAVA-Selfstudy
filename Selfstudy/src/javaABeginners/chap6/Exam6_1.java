package javaABeginners.chap6;

import java.util.Scanner;

class RecursiveMethod {
	String str;

	RecursiveMethod(String msg) {
		str = msg;
	}

	void backWard() {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}

public class Exam6_1 {
	public static void main(String[] args) {
		String msg;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the messgag : ");
		msg = input.nextLine();
		RecursiveMethod bbb = new RecursiveMethod(msg);
		bbb.backWard();

	}
}
