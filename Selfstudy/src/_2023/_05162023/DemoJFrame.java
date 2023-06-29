package _2023._05162023;

import java.awt.Color;

import javax.swing.*;

public class DemoJFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // create a frame

		frame.setVisible(true); // make frame visible
		frame.setSize(420, 420); // set a X b a frame
		frame.setTitle("JFrame Mung_moong");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
		frame.setResizable(false); // prevent from resizing

		ImageIcon icon = new ImageIcon(
				"C:\\Users\\lsy84\\git\\JAVA-Selfstudy\\Selfstudy\\src\\Selftaught\\_05162023\\paw.jpg");
		frame.setIconImage(icon.getImage());
		// frame.getContentPane().setBackground(Color.orange); // set background color
		frame.getContentPane().setBackground(new Color(64, 224, 208)); // set color by RGB code
	}
}
