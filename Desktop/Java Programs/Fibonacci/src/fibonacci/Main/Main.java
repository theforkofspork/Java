package fibonacci.Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Main {
	
	final static int WIDTH = 250, HEIGHT = 75;
	final static Font font = new Font("Impact", Font.PLAIN, 24);
	
	
	public static int FibonacciIndexCalculator(int index)
	{
		if(index == 0) return 0;
		else if(index == 1 || index == 2) return 1;
		else return FibonacciIndexCalculator(index-1) + FibonacciIndexCalculator(index-2);
	}
	
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Fibonacci Index Calculator");
		JPanel panel = new JPanel();
		JLabel indexlbl = new JLabel("Enter index: ");
		JSpinner indexValue = new JSpinner(new SpinnerNumberModel(0,0,1000,1));
		JButton enter = new JButton("Enter");
		JLabel answer = new JLabel("");
		
		frame.setSize(new Dimension(WIDTH,HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH,HEIGHT));
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.gray);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		indexlbl.setFont(font);
		
		indexValue.setFont(font);
		
		enter.setFont(font);
		
		answer.setFont(font);
		
		panel.add(indexlbl);
		panel.add(indexValue);
		panel.add(enter);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		enter.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	answer.setText(String.valueOf(FibonacciIndexCalculator((int)indexValue.getValue())));
		    	
		    	panel.remove(indexlbl);
				panel.remove(indexValue);
				panel.remove(enter);
				panel.add(answer);
				SwingUtilities.updateComponentTreeUI(frame);
		    }
		});
	}
	
}
