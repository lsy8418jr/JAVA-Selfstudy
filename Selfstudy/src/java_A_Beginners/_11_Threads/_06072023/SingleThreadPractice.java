package java_A_Beginners._11_Threads._06072023;

import javax.swing.JOptionPane;

public class SingleThreadPractice {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Enter");
		System.out.println("your text is " + str);

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);

			} catch (Exception e) {
			}
		}

	}
}
