import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

public class Main 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Frame");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		SpinnerModel model = new SpinnerNumberModel(0,0.0,10000.0,0.1);
		JSpinner spinner = new JSpinner(model);
		
		final String[] scrollbaroptions = {"Kilometers", "Meters", "Centimeters",
											"Millimeters","Miles", "Yards", "Feet", "Inches"};
		JComboBox firstCB = new JComboBox(scrollbaroptions);
		
		JLabel to = new JLabel("to");
		
		JComboBox secondCB = new JComboBox(scrollbaroptions);
		
		JButton enter = new JButton("Enter");
		enter.setSize(100,30);
		
		panel.add(spinner);
		panel.add(firstCB);
		panel.add(to);
		panel.add(secondCB);
		panel.add(enter);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
		enter.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	panel.remove(spinner);
				panel.remove(firstCB);
				panel.remove(to);
				panel.remove(secondCB);
				panel.remove(enter);
				String answer = "";
				double value = (double) spinner.getValue();
				if(firstCB.getSelectedItem() == secondCB.getSelectedItem())
				{
					answer = String.valueOf(value);
				}
				else if(firstCB.getSelectedItem() == "Kilometers" && secondCB.getSelectedItem() == "Meters")
				{
					answer = String.valueOf(value*1000);
				}
				else if(firstCB.getSelectedItem() == "Kilometers" && secondCB.getSelectedItem() == "Centimeters")
				{
					answer = String.valueOf(value*100000);
				}
				else if(firstCB.getSelectedItem() == "Kilometers" && secondCB.getSelectedItem() == "Milliimeters")
				{
					answer = String.valueOf(value*1000000);
				}
				else if(firstCB.getSelectedItem() == "Kilometers" && secondCB.getSelectedItem() == "Miles"){
					answer = String.valueOf(value*0.621371);
				}
				else if(firstCB.getSelectedItem() == "Kilometers" && secondCB.getSelectedItem() == "Yard"){
					answer = String.valueOf(value*1093.61);
				}
				else if(firstCB.getSelectedItem() == "Kilometers" && secondCB.getSelectedItem() == "Feet"){
					answer = String.valueOf(value*3280.84);
				}
				else if(firstCB.getSelectedItem() == "Kilometers" && secondCB.getSelectedItem() == "Inches"){
					answer = String.valueOf(value*39370.1);
				}
				else if(firstCB.getSelectedItem() == "Meters" && secondCB.getSelectedItem() == "Kilometers")
				{
					answer = String.valueOf(value*0.001);
				}
				else if(firstCB.getSelectedItem() == "Meters" && secondCB.getSelectedItem() == "Centimeters")
				{
					answer = String.valueOf(value*100);
				}
				else if(firstCB.getSelectedItem() == "Meters" && secondCB.getSelectedItem() == "Milliimeters")
				{
					answer = String.valueOf(value*1000);
				}
				else if(firstCB.getSelectedItem() == "Meters" && secondCB.getSelectedItem() == "Miles"){
					answer = String.valueOf(value*0.000621371);
				}
				else if(firstCB.getSelectedItem() == "Meters" && secondCB.getSelectedItem() == "Yard"){
					answer = String.valueOf(value*1.09361);
				}
				else if(firstCB.getSelectedItem() == "Meters" && secondCB.getSelectedItem() == "Feet"){
					answer = String.valueOf(value*3.28084);
				}
				else if(firstCB.getSelectedItem() == "Meters" && secondCB.getSelectedItem() == "Inches"){
					answer = String.valueOf(value*39.3701);
				}
				else if(firstCB.getSelectedItem() == "Centimeters" && secondCB.getSelectedItem() == "Kilometers")
				{
					answer = String.valueOf(value*0.000001);
				}
				else if(firstCB.getSelectedItem() == "Centimeters" && secondCB.getSelectedItem() == "Meters")
				{
					answer = String.valueOf(value*0.01);
				}
				else if(firstCB.getSelectedItem() == "Centimeters" && secondCB.getSelectedItem() == "Milliimeters")
				{
					answer = String.valueOf(value*10);
				}
				else if(firstCB.getSelectedItem() == "Centimeters" && secondCB.getSelectedItem() == "Miles"){
					//answer = String.valueOf(value*0.000621371);
				}
				else if(firstCB.getSelectedItem() == "Centimeters" && secondCB.getSelectedItem() == "Yard"){
					//answer = String.valueOf(value*1.09361);
				}
				else if(firstCB.getSelectedItem() == "Centimeters" && secondCB.getSelectedItem() == "Feet"){
					//answer = String.valueOf(value*3.28084);
				}
				else if(firstCB.getSelectedItem() == "Centimeters" && secondCB.getSelectedItem() == "Inches"){
					//answer = String.valueOf(value*39.3701);
				}
				JLabel answerLabel = new JLabel(answer);
				answerLabel.setFont(new Font("Arial", Font.PLAIN, 30));
				panel.add(answerLabel);
				SwingUtilities.updateComponentTreeUI(frame);
				
		    }
		});
		
		
	}
}
