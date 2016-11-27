package com.Timer;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;


public class Timer extends Applet implements KeyListener{

	private static final long serialVersionUID = -3444377993458620215L;
	final int frameWidth = 500, frameHeight = frameWidth/12*9;
	double currentTime = 0.0;
	public void init(){
		setSize(500,500);
		setBackground(Color.yellow);
		setFocusable(true);
		this.addKeyListener(this);
		setVisible(true);
	}
	public Timer(){
		//Window(frameWidth, frameHeight, "Frame", this);
		
	}
	
	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.black);
		g2.drawString(genScramble(), 100,100);
	}
	
	
	public void keyTyped(KeyEvent e) {} public void keyReleased(KeyEvent e) {}
	
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) repaint();
	}
	
	
	public static String genScramble()
	{
		StringBuilder SB = new StringBuilder();
		int previousFace = 0, scrambleRV = 0;
		float markRV = 0.0;
		
		for(int i = 0; i < (int)Math.random()*2+20; i++){
			
			while(scrambleRV == previousFace)
			{
				scrambleRV = (int)Math.random()*5+1;
			}

			switch(scrambleRV)
			{
			case 1: SB.append("F");
			break;
			case 2: SB.append("B");
			break;
			case 3: SB.append("R");
			break;
			case 4: SB.append("L");
			break;
			case 5: SB.append("U");
			break;
			case 6: SB.append("B");
			break;
			
			}
			
			markRV = Math.random();
			if(markRV <= 0.4) SB.append("");
			else if(markRV >= 0.41 && markRV <= 0.6) SB.append("'");
			else if(markRV >= 0.61 && markRV <= 1.0) SB.append("2");
			
			previousFace = scrambleRV;
		}
		return SB.toString();
	}
	
	
	public void Window(int Width, int Height, String Title, Timer timer)
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
	
	
	public static void main(String[] args)
	{
		new Timer();
	}


	

	
}
