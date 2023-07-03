package java_A_Beginners._16_Swing._07032023;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TFDemo implements ActionListener {
	JTextField jtf;

	JButton jbtnRev;
	JLabel jlabPrompt, jlabContents;

	public TFDemo() {

		JFrame jfrm = new JFrame("Use a Text Field");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(240, 120);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jtf = new JTextField(10); // create a text field that is 10 columns wide

		jtf.setActionCommand("myTF");

		jbtnRev = new JButton("Reverse");

		jtf.addActionListener(this);
		jbtnRev.addActionListener(this);

		jlabPrompt = new JLabel("Enter Text : ");
		jlabContents = new JLabel("");
		jfrm.add(jlabPrompt);
		jfrm.add(jbtnRev);
		jfrm.add(jtf);
		jfrm.add(jlabContents);

		jfrm.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Reverse")) {
			String orgStr = jtf.getText();
			String resStr = "";

			for (int i = orgStr.length() - 1; i >= 0; i--) {
				resStr += orgStr.charAt(i);
				jtf.setText(resStr);
			}

		} else {
			jlabContents.setText("You pressed enter. Text is : " + jtf.getText());
		}

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new TFDemo();
			}
		});
	}

}
