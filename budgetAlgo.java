package BudgetCreater;
// Title: budgetAlgo.java
// Author: Nathan Tamari
// contains Algorithms for the execution of budgetDriver
// Enter current income, expected income growth, monthly expenses (which are assumed to stay
// the same), principal, and eventual goal of final amount

import java.awt.*;
import javax.swing.*;

public class budgetAlgo extends JPanel{
	// variable creation
	
	
	//JSLiders *************************
	private budgetJSlider incomeSlider;
	private JSlider slide;
	private int incomeSliderValue, incomeGrowthValue;
	// *********************************
	
	// JTextFields *******
	private JTextArea incomeText, incomeGrowth, monthlyExpenses, goalAmount, principalAmount;
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
		
	}

	//paints everything
	public void paintComponent(Graphics g) {
		//creates JSliders
		slide = incomeSlider.getSlider();
		slide.setVisible(true);
		slide.setBounds(300, 50, 100, 40);
		add(slide);
		
		//creates JTextAreas
		incomeGrowth = new JTextArea("  " + incomeSliderValue + "%");
		incomeGrowth.setBounds(400,50,70,30);
		incomeGrowth.setEditable(true);
		add(incomeGrowth);
		
		incomeText = new JTextArea("");
		incomeText.setBounds(0,50,100,30);
		incomeText.setEditable(true);
		add(incomeText);
		
		
	}
	
	public void setSliderValue(int newVal)
	{
		incomeSliderValue = newVal;
		incomeGrowth.setText("  " + newVal + "%");
	}
		
	}
	
