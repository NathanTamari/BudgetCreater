package BudgetCreater;
// Title: budgetAlgo.java
// Author: Nathan Tamari
// contains Algorithms for the execution of budgetDriver

import java.awt.*;
import javax.swing.*;

public class budgetAlgo extends JPanel{
	// variable creation
	
	
	//JSLiders *************************
	private budgetJSlider incomeSlider;
	private JSlider slide;
	private int incomeSliderValue;
	// *********************************
	
	// JTextFields *******
	private JTextArea incomeText;
	// *******************

	public budgetAlgo()
	{
		//************************************************
		//setup and declaring variables
		//************************************************
		setLayout(null);
		setPreferredSize(new Dimension(500,500));
		
		incomeSlider = new budgetJSlider(this);
		incomeSliderValue = incomeSlider.getSlider().getValue();
		
	}

	//paints everything
	public void paintComponent(Graphics g) {
		//creates JSliders
		slide = incomeSlider.getSlider();
		slide.setVisible(true);
		slide.setBounds(0,0, 100, 200);
		add(slide);
		
		//creates JTextAreas
		incomeText = new JTextArea("  " + incomeSliderValue);
		incomeText.setBounds(0,0,150,50);
		incomeText.setEditable(false);
		add(incomeText);
		
		
	}
	
	public void setSliderValue(int newVal)
	{
		incomeSliderValue = newVal;
		incomeText.setText("  " + newVal + "  ");
	}
		
	}
	
