package day3;

import javax.swing.JOptionPane;

public class greeter {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null, "whats your name");
	JOptionPane.showMessageDialog(null, "hi "+answer);
	
	
}
}
