package thing.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import thing.ids.*;


public class Thing extends Canvas implements Runnable
{

	final static int width = 500, height = width/12*9;
	private static final long serialVersionUID = 1L;
	
	private Thread thread;
	private boolean threadRunning = false;
	private Handler hand;
	
	public Thing()
	{
		hand = new Handler();
		
		this.addKeyListener(new KeyInput(hand));
		setFocusable(true);
		
		new Frame(width, height, this);
		
		hand.addObject(new PlayerOne(0, height / 2 - 32, ID.PlayerOne));
		hand.addObject(new PlayerOne(width - 8, height / 2 - 32, ID.PlayerTwo));
		hand.addObject(new Ball(width / 2 - 8, height / 2 - 8, ID.Ball, hand));
		hand.addObject(new Score(width / 2 - 96, 64, ID.LeftScore, false));
		hand.addObject(new Score(width / 2 + 48, 64, ID.RightScore, true));
	}

	public synchronized void start()
	{
		thread = new Thread(this);
		thread.start();
		threadRunning = true;
	}
	
	public synchronized void stop()
	{
		try{
			thread.join();
			threadRunning = false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void tick()
	{
		hand.tick();
	}
	
	private void render()
	{
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);
		
		hand.render(g);
		
		g.dispose();
		bs.show();
	}
	
	public void run() 
	{
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(threadRunning)
		{
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			
			while(delta >= 1)
			{
				tick();
				delta--;
			}
			
			if(threadRunning) 
				render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000)
			{
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
		
	}
	
}