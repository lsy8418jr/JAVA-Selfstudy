package _2023._05_17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class DemoJPanel {
	public static void main(String[] args) {
		ImageIcon icon = new ImageIcon(
				"C:\\Users\\lsy84\\git\\JAVA-Selfstudy\\Selfstudy\\src\\Selftaught\\_05172023\\download.jpg");

		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.TOP);

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());

		JFrame frame = new JFrame(); // create a frame
		frame.setVisible(true); // make frame visible
		frame.setSize(750, 750); // set a X b a frame
		frame.setTitle("JFrame Mung_moong");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
		frame.setLayout(null);
		greenPanel.add(label);
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);

	}
}
