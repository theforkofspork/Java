package com.hotelsim.main;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {

	public Window(JFrame frame, int width, int height, HotelSim game){
		
		frame = new JFrame();
		
		frame.setSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		frame.add(game);
		
	}
	
}
