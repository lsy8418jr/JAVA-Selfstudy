package java_A_Beginners._16_Swing._07052023;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ListDemo implements ListSelectionListener {

	JList<String> jlist;
	JLabel lab;
	JScrollPane scrl;

	String[] names = { "Sherry", "Jon", "Rachel", "Sasha", "Josselyn", "Randy", "Tom", "Mary", "Ken", "Andrew", "Matt",
			"Todd" };

	public ListDemo() {
		JFrame frm = new JFrame("JList Demo");
		frm.setLayout(new FlowLayout());
		frm.setSize(500, 400);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jlist = new JList<>(names);
		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrl = new JScrollPane(jlist);
		scrl.setPreferredSize(new Dimension(200, 150));
		lab = new JLabel("Please choose a name");
		jlist.addListSelectionListener(this);
		frm.add(scrl);
		frm.add(lab);
		frm.setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int index = jlist.getSelectedIndex();
		if (index != -1) {
			lab.setText("Current selection : " + names[index]);
		} else {
			lab.setText("please choose a name");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ListDemo();
			}
		});
	}

}
