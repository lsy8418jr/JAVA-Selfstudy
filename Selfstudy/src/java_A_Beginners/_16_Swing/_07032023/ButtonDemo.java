package java_A_Beginners._16_Swing._07032023;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.security.DomainCombiner;

import javax.swing.*;

public class ButtonDemo implements ActionListener {
	JLabel jlab;

	public ButtonDemo() {

		JFrame jfrm = new JFrame("A button example");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(400, 220);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnUp = new JButton("Up");
		JButton btnDown = new JButton("Down");

		btnUp.addActionListener(this);
		btnDown.addActionListener(this);

		jfrm.add(btnUp);
		jfrm.add(btnDown);

		jlab = new JLabel("Press a button");
		jfrm.add(jlab);
		jfrm.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Up")) {
			jlab.setText("You pressed up");
		} else {
			jlab.setText("You pressed down");
		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ButtonDemo();
			}
		});
	}

}
