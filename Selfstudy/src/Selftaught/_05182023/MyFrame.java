package Selftaught._05182023;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

	JButton button = new JButton();

	MyFrame() {

		button.setBounds(200, 100, 100, 50);
		button.addActionListener(this);
		
		
		this.setVisible(true); // make frame visible
		this.setSize(500, 500); // set a X b a frame
		this.setTitle("JFrame Mung_moong");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app
		this.setLayout(null);
		this.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println("POO");
		}

	}
}
