package java_A_Beginners._10_Using_IO._05222023;

import java.io.*;

public class ShowFile {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;

		if (args.length != 1) {
			System.out.println("Usage: ShowFile File");
			return;
		}
		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException exc) {
			System.out.println("File not found");
			return;
		}
		try {
			do {
				i = fin.read();
				if (i != -1) {
					System.out.print((char) i);
				}
			} while (i != -1);
		} catch (IOException exc) {
			System.out.println("error reading file");
		}
		try {
			fin.close();
		} catch (IOException exc) {
			System.out.println("error closing file");
		}
	}
}
