package thing.main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame 
{

	
	public Frame(int width, int height, Thing thing)
	{
		JFrame frame = new JFrame(" ");
		
		frame.setSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		frame.setResizable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.add(thing);
		
		frame.setVisible(true);
		
		thing.start();
	}
	
}
