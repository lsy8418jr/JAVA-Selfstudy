package Selftaught._05162023;

import java.io.File;

public class DemoFiles {
	public static void main(String[] args) {
		File f1 = new File("D:\\download\\Java\\java_demofile.txt");

		if (f1.exists()) {
			System.out.println("the file exists");
		} else {
			System.out.println("there is no file");
		}
	}

}
