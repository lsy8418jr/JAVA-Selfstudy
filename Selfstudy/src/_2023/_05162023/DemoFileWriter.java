package _2023._05162023;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {
	public static void main(String[] args) {
		try {
			FileWriter w1 = new FileWriter("poem.txt");
			w1.write("roses are red \n violets are blue\nbooty booty\n everywhere");
			w1.append("\nA poem by Scott");

			w1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
