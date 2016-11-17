package com.Timer;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends Canvas{

	private static final long serialVersionUID = 4386272966169317587L;

	public Window(int Width, int Height, String Title, Timer timer)
	{
		final Dimension frameSize = new Dimension(Width,Height);
		
		JFrame frame = new JFrame(Title);
		
		frame.setPreferredSize(frameSize);
		frame.setMaximumSize(frameSize);
		frame.setMinimumSize(frameSize);
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(timer);
		frame.setVisible(true);
		
		
	}
	
}
