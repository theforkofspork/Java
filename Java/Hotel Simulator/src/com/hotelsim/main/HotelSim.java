package com.hotelsim.main;

import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

public class HotelSim extends Canvas implements Runnable{

	
	private static final long serialVersionUID = 740311057794423001L;

	static JFrame frame;
	
	public HotelSim(){
		
		new Window(frame,500,500,this);
		
		BufferStrategy s = frame.getBufferStrategy();
	    Graphics2D g = (Graphics2D)s.getDrawGraphics();
		
		
	}
	
	public void run() {
		
	}
	long initialTime = System.nanoTime();
	final int FPS = 30;
	final int UPS = 30;
	final double timeU = 1000000000 / UPS;
	final double timeF = 1000000000 / FPS;
	double deltaU = 0, deltaF = 0;
	int frames = 0, ticks = 0;
	long timer = System.currentTimeMillis();

	    while (running) {

	        long currentTime = System.nanoTime();
	        deltaU += (currentTime - initialTime) / timeU;
	        deltaF += (currentTime - initialTime) / timeF;
	        initialTime = currentTime;

	        if (deltaU >= 1) {
	        	//Update
	            ticks++;
	            deltaU--;
	        }

	        if (deltaF >= 1) {
	        	//Tick
	            frames++;
	            deltaF--;
	        }

	        if (System.currentTimeMillis() - timer > 1000) {
	            frames = 0;
	            ticks = 0;
	            timer += 1000;
	        }
	    }
	}
	
	public static void main(String[] args) {
		
		frame = new JFrame();
		new HotelSim();
		
	}

}
