package Selftaught._04202023;

import java.util.Scanner;

public class RowColumn {
	public static void main(String[] args) {
		int row, column;
		String symbol;
		Scanner input = new Scanner(System.in);

		System.out.print("enter number of rows :");
		row = input.nextInt();
		System.out.print("enter number of columns :");
		column = input.nextInt();
		System.out.print("enter the symbol :");
		symbol = input.next();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
}
