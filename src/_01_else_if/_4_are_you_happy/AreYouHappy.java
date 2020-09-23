package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog(null, "Are you happy?");

		// if yes -> do something
		// else no -> do something else

		if (s.equalsIgnoreCase("No")) {
			String f = JOptionPane.showInputDialog(null, "Do you want to be happy");
			if (f.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Okay then change something");

			}
			if (f.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Okay keep doing what you are doing");
			}
		} else if (s.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "ok keep doing what you are doing");
			// Display message..
			// Keep doing whatever you're doing

		} 

	}
}
