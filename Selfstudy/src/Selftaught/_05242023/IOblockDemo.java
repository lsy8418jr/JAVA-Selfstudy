package Selftaught._05242023;

import javax.swing.JOptionPane;

public class IOblockDemo {
	public static void main(String[] args) throws Exception {
		String input = JOptionPane.showInputDialog("enter your text");
		System.out.println(input);

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
