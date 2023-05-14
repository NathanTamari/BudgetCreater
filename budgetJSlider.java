package BudgetCreater;

// Name: budgetJSlider
// Author: Nathan Tamari
// Uses JSliders to adjust values for budget

//imports
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class budgetJSlider implements ChangeListener {
	
	//variables
	private JSlider slider;
	private budgetAlgo p;
	
	public budgetJSlider(budgetAlgo i)
	{
		//creates min,max,starting values
		slider = new JSlider(0,10,5);
		slider.setPreferredSize(new Dimension (10,20));
		slider.addChangeListener(this);
		p=i;
	}
	
	//updates values of slider (set method)
	public void stateChanged(ChangeEvent e)
	{
		p.setSliderValue(slider.getValue());
	}
	
	//get method
	public JSlider getSlider()
	{
		return slider;
	}
	
	
}
