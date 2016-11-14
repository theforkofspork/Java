/*
 * Written by Sam Wendolek
 * 11/14/16
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;


public class FibonacciIndex
{

	public static void main(String[] args) 
	{
		final Font font = new Font("Impact", Font.PLAIN, 24);
		JFrame frame = new JFrame("Fibonacci Sequence");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		
		JLabel indexLbl = new JLabel("Index:");
		indexLbl.setFont(font);
		
		JSpinner indexSpinner = new JSpinner(new SpinnerNumberModel(0 , 0, 999999 , 1 ));
		indexSpinner.setSize(100,30);
		indexSpinner.setFont(new Font("Impact", Font.PLAIN, 24));
		
		JButton enter = new JButton("Enter");
		enter.setFont(new Font("Impact", Font.PLAIN, 24));
		
		JLabel answer = new JLabel(" ");
		answer.setFont(new Font("Impact", Font.PLAIN, 24));
		
		panel.add(indexLbl);
		panel.add(indexSpinner);
		panel.add(enter);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
		enter.addActionListener(new ActionListener() 
		{
			
	        public void actionPerformed(ActionEvent e) 
	        {
	             answer.setText(String.valueOf(fibo((int) indexSpinner.getValue())));
	        	 panel.remove(indexLbl);
	             panel.remove(indexSpinner);
	             panel.remove(enter);
	             
	             panel.add(answer);
	             
	             SwingUtilities.updateComponentTreeUI(frame);
	             
	             
	        }
	        
	        });
	}
	
	
	private static int fibo(int i)
	{
		if(i <= 0) return 0;
		if(i <= 2) return 1;
		
		return (i - 1) + (i - 2);
		
	}
	
}
