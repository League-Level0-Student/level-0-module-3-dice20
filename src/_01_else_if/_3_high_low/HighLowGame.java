
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) + 1;

		// 2. Print out the random variable above
		//System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {

			// 1. Ask the user for a guess using a pop-up window, and save their response
			String ranguess = JOptionPane.showInputDialog(null, "what do you think the random numder is?");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int ranint = Integer.parseInt(ranguess);
			// 5. if the guess is correct
			if (ranint == random) {
				JOptionPane.showMessageDialog(null, "YAY you guessed the random number!!!");
				System.exit(0);
			}
			// 6. Win
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right
			// answer
			else if (ranint > random) {
				JOptionPane.showMessageDialog(null, "Sorry bud you got the wrong number go a little less");
			}
			// 7. if the guess is high
			else {
				JOptionPane.showMessageDialog(null, "Sorry pal you got the wrong number go a little higher than that");

			}
		}
JOptionPane.showMessageDialog(null, "Sorry no luck try again next time");
		// 8. Tell them it's too high
		// 9. if the guess is low
		// 10. Tell them it's too low

		// 13. Tell them they lose

	}

}
