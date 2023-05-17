package BudgetCreater;
// Title: budgetDriver.java
// Author: Nathan Tamari
// Client Class for budgetAlgo

//imports for using java swing
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
//import javax.swing.JOptionPane;

public class budgetDriver {
	
	//Object reference variable
	private static budgetAlgo p;
	private static String userInput;
	private static boolean go;
	
	public static void main (String[] args)
	{
		go=false;
		JFrame frame = new JFrame("test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new budgetAlgo());
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(false);	
		frame.setBackground(Color.cyan);
		
		while(go)
		{
			System.out.println("test");
			userInput = JOptionPane.showInputDialog("");
			p.calculateYears(userInput);
			go=false;
			
		}

	}
	
	public void go()
	{
		System.out.println("test");
		go=true;
	}
	
//	public String getInput()
//	{
//		userInput = JOptionPane.showInputDialog("");
//		System.out.println("yo wtf");
//		return userInput;
//	}
}
