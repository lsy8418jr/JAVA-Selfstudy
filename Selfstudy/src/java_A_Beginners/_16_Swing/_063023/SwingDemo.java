package java_A_Beginners._16_Swing._063023;

import javax.swing.*;

public class SwingDemo {
	public SwingDemo() {

		JFrame jfrm = new JFrame("A simple swing app");
		jfrm.setSize(400, 400);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // terminate on close
		jfrm.setResizable(false);

		JLabel jlab = new JLabel(" Swing defines the modern java GUI");
		jfrm.add(jlab);
		jfrm.setVisible(true);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}
