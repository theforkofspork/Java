package game.Game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class Frame {
	public Frame(int width, int height, String title, Point location)
	{
		JFrame frame = new JFrame(title);
		
		frame.setSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		frame.setResizable(false);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLocation(location);
		frame.setBackground(Color.gray);
		
		frame.setVisible(true);
	}
}
