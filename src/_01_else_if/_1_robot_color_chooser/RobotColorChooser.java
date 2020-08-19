
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. C5eate a new Robot
		// 2. Make the robot draw a shape (this will take more than one line of code)
		// 3. Set the pen width to 10
		// 4. Ask the user what color pen they would like the robot to draw with
		// 5. Use an if/else statement to set the pen color that the user requested
		// 6. If the user doesn't enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them
		Robot YEET = new Robot("mini");
		for (int t = 0; t < 3; t++) {

			String color = JOptionPane.showInputDialog(null, "What color do you want me to draw with?");
			if (color.equalsIgnoreCase("green")) {
				YEET.setPenColor(Color.GREEN);
			} else if (color.equalsIgnoreCase("blue")) {
				YEET.setPenColor(Color.BLUE);
			} else {
				YEET.setRandomPenColor();

			}

			YEET.hide();
			YEET.setSpeed(30);
			YEET.setPenWidth(15);
			for (int i = 0; i < 5; i++) {
				YEET.penDown();
				YEET.move(300);
				YEET.turn(144);
			}
		}

	}
}
