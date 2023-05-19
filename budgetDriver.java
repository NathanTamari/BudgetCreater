package BudgetCreater;
// Title: budgetDriver.java
// Author: Nathan Tamari
// Client Class for  budgetAlgo

//imports for using java swing
import javax.swing.JFrame;
import java.awt.Color;
//import javax.swing.JOptionPane;

public class budgetDriver {
	public static void main (String[] args)
	{
		JFrame frame = new JFrame("test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new budgetAlgo());
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);	
		frame.setBackground(Color.cyan);
	}
}