package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
         String pizza = JOptionPane.showInputDialog( null, "do you know how to write code");
		// 2. If they say "yes", tell them they will rule the world.
         if (pizza.equals("yes")) {
        	 JOptionPane.showMessageDialog(null, "they will rule the world");
			
		}else{
			JOptionPane.showMessageDialog(null, "good luck washing dishes");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

