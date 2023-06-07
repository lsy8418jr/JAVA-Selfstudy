package javaABeginners.chap10._06062023;

import java.io.*;

public class AvgNums {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n;
		double sum = 0;
		double avg, t;

		System.out.println("How many numbers will you enter : ");
		str = br.readLine();
		try {
			n = Integer.parseInt(str); // convert string to int

		} catch (NumberFormatException e) {
			System.out.println("invalid");
			n = 0;
		}
		System.out.println("Enter " + n + " values");
		for (int i = 0; i < n; i++) {
			System.out.print(": ");
			str = br.readLine();
			try {
				t = Double.parseDouble(str);// convert string to double
			} catch (NumberFormatException e) {
				System.out.println("invalid format");
				t = 0.0;
			}
			sum += t;
		}
		avg = sum / n;
		System.out.println("average is " + avg);

	}

}
