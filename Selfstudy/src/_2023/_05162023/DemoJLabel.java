package _2023._05162023;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class DemoJLabel {
	public static void main(String[] args) {

		JLabel label = new JLabel("Do you know Java?");
		// label.setText("Do you know Java?"); possible too

		ImageIcon image = new ImageIcon(
				"C:\\Users\\lsy84\\git\\JAVA-Selfstudy\\Selfstudy\\src\\Selftaught\\_05162023\\dog.jpg");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(200, 100, 50)); // font color
		label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // font style
		label.setIconTextGap(20);

		JFrame frame = new JFrame(); // create a frame
		frame.setVisible(true); // make frame visible
		frame.setSize(420, 420); // set a X b a frame
		frame.setTitle("JFrame Mung_moong");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(label);

	}
}
