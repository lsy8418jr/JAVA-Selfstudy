package _2023._04_15;

import javax.swing.JOptionPane;



class GuiPractice {
	public static void main(String[] args) {
		String name=JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+ age+" years old");
	}
}