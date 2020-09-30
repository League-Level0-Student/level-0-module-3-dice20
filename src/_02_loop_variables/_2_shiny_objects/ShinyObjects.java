
package _02_loop_variables._2_shiny_objects;

import javax.swing.JOptionPane;

public class ShinyObjects {
	public static void main(String[] args) {

		// 1. Call the method below
		// 2. Ask the user how many shiny objects they want
		// 3. Call the method that many times

		playMisterZee();
		String zero = JOptionPane.showInputDialog(null, "How many shiny objects does Mr. Zee want?");
		int num = Integer.parseInt(zero);
		for (int i = 0; i < num; i++) {
		playMisterZee();
		}
	}

	/********************
	 * Use this method. DON'T CHANGE THE CODE BELOW
	 ***********************/

	public static void playMisterZee() {
		System.out.println("Mr. Zee requires shiny objects!");
	}

}
