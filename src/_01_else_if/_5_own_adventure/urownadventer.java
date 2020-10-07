package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class urownadventer {
	public static void main(String[] args) {

		String option = JOptionPane.showInputDialog(null,
				"You and your teamate are in a fight do you chose to run away and heal up or fight back?");

		if (option.equalsIgnoreCase("I chose to fight back")) {
			JOptionPane.showMessageDialog(null,
					"You and your teamate hit one and lower thier HP by 199 they have 1 HP left");

		} else if (option.equalsIgnoreCase("I chose to run away and heal")) {
			JOptionPane.showMessageDialog(null, "Okay you run and hide to heal but you encounter another team!");
			option = JOptionPane.showInputDialog(null,
					"You and your teamate are in a fight do you chose to run away and heal up or fight back?");
			if (option.equalsIgnoreCase("I chose to fight back")) {
				JOptionPane.showMessageDialog(null,
						"You and your teamate hit one and lower thier HP by 199 they have 1 HP left");
			} else {
				JOptionPane.showMessageDialog(null, "You succesfuly run and heal but, are now caught in the storm");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Erorr 404");
		}
	}

}
