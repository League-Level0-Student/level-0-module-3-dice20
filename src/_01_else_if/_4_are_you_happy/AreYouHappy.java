package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog(null, "Are you happy?");
		
		//if yes -> do something
		//else no -> do something else
		
		if(s.equalsIgnoreCase("No")){
			
		} 
		else {
			JOptionPane.showMessageDialog(null, "ok keep doing what you are doing");
			//Display message..
			//Keep doing whatever you're doing
			
		}
		
	}
}
