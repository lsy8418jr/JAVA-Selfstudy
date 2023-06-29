package _2023._2Q._05_16;

import java.io.File;

public class GetFilePath {

	public static void main(String[] args) {
		File f1 = new File("poem.txt");

		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.getPath());
		System.out.println(f1.isFile());
		// f1.delete(); file delete
	}
}
