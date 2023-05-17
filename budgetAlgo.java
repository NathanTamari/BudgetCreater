package BudgetCreater;
// Title: budgetAlgo.java
// Author: Nathan Tamari
// contains Algorithms for the execution of budgetDriver
// Enter current income, expected income growth, monthly expenses (which are assumed to stay
// the same), principal, and eventual goal of final amount

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class budgetAlgo extends JPanel{
	// variable creation
	
	
	//JSLiders *************************
	private budgetJSlider incomeSlider;
	private JSlider slide;
	private int incomeSliderValue, years, income, monthly, principal, goal, incomeTotal, stock;
	private JButton calculate, incomeB, monthlyB, goalAmountB, principalB, incomeTextB, stockB;
	private budgetDriver driver;
	// *********************************
	
	// JTextFields *******
	private JTextArea incomeGrowth, monthlyExpenses, goalAmount, principalAmount, iText, igText,
	mExpense, mGoal, pAmount, sGrowth, stockGrowth, totalYears, incomeText;
	// *******************

	public budgetAlgo()
	{
		//************************************************
		//setup and declaring variables
		//************************************************
		setLayout(null);
		setPreferredSize(new Dimension(1000,500));
		
		incomeSlider = new budgetJSlider(this);
		incomeSliderValue = incomeSlider.getSlider().getValue();
		
		driver = new budgetDriver();
	}

	//paints everything
	public void paintComponent(Graphics g) {
		//creates JSliders
		slide = incomeSlider.getSlider();
		slide.setVisible(true);
		slide.setBounds(300, 60, 100, 40);
		
		add(slide);
		//creates transparent JButtons to open dialog boxes
		incomeB = new JButton("Change");
		incomeB.setBounds(400,30,70,20);
		incomeB.addActionListener(new incomeBListen());	
		add(incomeB);
		
		monthlyB = new JButton("Change");
		monthlyB.setBounds(700,30,100,20);
		monthlyB.addActionListener(new monthlyBListen());	
		add(monthlyB);
		
		goalAmountB = new JButton("Change");
		goalAmountB.setBounds(30,140,150,20);
		goalAmountB.addActionListener(new goalAmountBListen());	
		add(goalAmountB);
		
		principalB = new JButton("Change");
		principalB.setBounds(400,140,150,20);
		principalB.addActionListener(new principalBListen());	
		add(principalB);
		
		incomeTextB = new JButton("Change");
		incomeTextB.setBounds(30,30,100,30);
		incomeTextB.addActionListener(new incomeTextBListen());	
		add(incomeTextB);
		
		stockB = new JButton("Change");
		stockB.setBounds(700,140,100,30);
		stockB.addActionListener(new stockBListen());	
		add(stockB);
		
		
		//creates JTextAreas that are going to be edited ******************************
		incomeGrowth = new JTextArea("  " + incomeSliderValue + "%");
		incomeGrowth.setBounds(400,60,70,40);
		incomeGrowth.setEditable(false);
		add(incomeGrowth);
		
		incomeText = new JTextArea("77hjkhkhj");
		incomeText.setBounds(30,60,100,30);
		incomeText.setEditable(false);
		add(incomeText);
		
		monthlyExpenses = new JTextArea("");
		monthlyExpenses.setBounds(700,60,100,30);
		monthlyExpenses.setEditable(false);
		add(monthlyExpenses);
		
		goalAmount = new JTextArea("");
		goalAmount.setBounds(30,175,150,20);
		goalAmount.setEditable(false);
		add(goalAmount);
		
		principalAmount = new JTextArea("");
		principalAmount.setBounds(400,175,150,20);
		principalAmount.setEditable(false);
		add(principalAmount);
		
		stockGrowth = new JTextArea("10%");
		stockGrowth.setBounds(700,175,100,30);
		stockGrowth.setEditable(false);
		add(stockGrowth);
		// *******************************************************************
		
		
		//shows where to enter what *********
		iText = new JTextArea("Enter annual income:");
		iText.setBounds(30,10,160,20);
		iText.setEditable(false);
		iText.setBackground(Color.cyan);
		add(iText);
		
		igText = new JTextArea("Enter your annual expected income growth rate:");
		igText.setBounds(300,10,300,20);
		igText.setEditable(false);
		igText.setBackground(Color.cyan);
		add(igText);
		
		mGoal = new JTextArea("Enter the total amount you want to" + "\n" + "end up with:");
		mGoal.setBounds(30,100,350,50);
		mGoal.setEditable(false);
		mGoal.setBackground(Color.cyan);
		add(mGoal);
		
		mExpense = new JTextArea("Enter your monthly expenses:");
		mExpense.setBounds(700,10,300,20);
		mExpense.setEditable(false);
		mExpense.setBackground(Color.cyan);
		add(mExpense);
		
		pAmount = new JTextArea("Enter your principal amount:");
		pAmount.setBounds(400,100,250,20);
		pAmount.setEditable(false);
		pAmount.setBackground(Color.cyan);
		add(pAmount);
		
		sGrowth = new JTextArea("Enter expected annual stock growth:" + "\n" + 
		"(10% is average market return)");
		sGrowth.setBounds(700,100,250,40);
		sGrowth.setEditable(false);
		sGrowth.setBackground(Color.cyan);
		add(sGrowth);
		// **********************************
		
		//***** JButton
		calculate = new JButton("Calculate:");
		calculate.addActionListener(new pressButton());
		calculate.setBounds(450,250,100,40);
		add(calculate);
		//*****
	}
	
	//calculates everything
	public void calculateYears(String s) {		
	}
	
	
	//removes all non numerical values from the JTextArea
	public int onlyNumbers(String jtext){
		char ch;
		String newNum = "";
		for(int i=0; i<jtext.length(); i++)
		{
			ch=jtext.charAt(i);
			if(Character.isDigit(ch)) newNum+=ch;
		}
		return Integer.parseInt(newNum);
	}
	
	
	//sets slider value
	public void setSliderValue(int newVal)
	{
		incomeSliderValue = newVal;
		incomeGrowth.setText("  " + newVal + "%");
	}
	
	//calculates total
		private class pressButton implements ActionListener
		{		
		public void actionPerformed(ActionEvent e) {
			calculateYears("");	
			}
		}
		
		
		// action listens for showInputDialog JButtons**********************
		private class incomeBListen implements ActionListener
		{		
		public void actionPerformed(ActionEvent e) {
			driver.go();
			}
		}
		private class monthlyBListen implements ActionListener
		{		
		public void actionPerformed(ActionEvent e) {
			
			}
		}
		private class goalAmountBListen implements ActionListener
		{		
		public void actionPerformed(ActionEvent e) {

			}
		}
		private class principalBListen implements ActionListener
		{		
		public void actionPerformed(ActionEvent e) {

			}
		}
		private class incomeTextBListen implements ActionListener
		{		
		public void actionPerformed(ActionEvent e) {

			}
		}
		private class stockBListen implements ActionListener
		{		
		public void actionPerformed(ActionEvent e) {
			
			}
		}
		

		//***************************************************
		
	}
	
