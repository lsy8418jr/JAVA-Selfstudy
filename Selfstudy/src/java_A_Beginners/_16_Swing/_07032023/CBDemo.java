package java_A_Beginners._16_Swing._07032023;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class CBDemo implements ItemListener {
	JLabel labSelected, labChanged;
	JCheckBox cbA, cbB, cbC;

	public CBDemo() {

		JFrame frm = new JFrame("demonstrate check boxes");
		frm.setLayout(new FlowLayout());
		frm.setSize(280, 120);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labSelected = new JLabel("");
		labChanged = new JLabel("");

		cbA = new JCheckBox("Alpha");
		cbB = new JCheckBox("Beta");
		cbC = new JCheckBox("Charlie");

		cbA.addItemListener(this);
		cbB.addItemListener(this);
		cbC.addItemListener(this);

		frm.add(cbA);
		frm.add(cbB);
		frm.add(cbC);
		frm.add(labChanged);
		frm.add(labSelected);
		frm.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		String str = "";

		JCheckBox cb = (JCheckBox) e.getItem();

		if (cb.isSelected()) {
			labChanged.setText(cb.getText() + " was just selected");

		} else {
			labChanged.setText(cb.getText() + " was just cleared");
		}
		if (cbA.isSelected()) {
			str += "Alpha ";
		}
		if (cbB.isSelected()) {
			str += "Beta ";
		}
		if (cbC.isSelected()) {
			str += "Gamma";
		}
		labSelected.setText("selected check boxes: " + str);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new CBDemo();
			}
		});

	}
}
