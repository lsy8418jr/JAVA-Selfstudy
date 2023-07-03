package java_A_Beginners._16_Swing._063023;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo {
	JLabel jlab;

	public EventDemo() {

		JFrame frm = new JFrame("An event example");
		frm.setLayout(new FlowLayout());

		frm.setSize(400, 400);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton jbtnA = new JButton("AA");
		JButton jbtnB = new JButton("BB");

		jbtnA.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jlab.setText("AA was pressed.");

			}
		});
		jbtnB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jlab.setText("BB was pressed.");

			}
		});
		frm.add(jbtnA);
		frm.add(jbtnB);

		jlab = new JLabel("Press a button");
		frm.add(jlab);
		frm.setVisible(true);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				new EventDemo();

			}
		});
	}
}
