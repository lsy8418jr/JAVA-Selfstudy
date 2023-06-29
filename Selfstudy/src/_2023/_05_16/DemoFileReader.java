package _2023._05_16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
	public static void main(String[] args) {
		try {
			FileReader read = new FileReader("art.txt");
			int data = read.read();
			while (data != -1) {
				System.out.print((char) data);
				data = read.read();
			}
			read.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
