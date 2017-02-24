package thing.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter
{

	private Handler handler;
	private boolean gameStarted = false;
	
	public KeyInput(Handler handler)
	{
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		for(int i = 0; i < handler.object.size(); i++)
		{
			Object tempObject = handler.object.get(i);
			if(tempObject.getID() == ID.PlayerOne)
			{
				if(key == KeyEvent.VK_W && tempObject.getY() > 0) tempObject.setY(tempObject.getY() - 20);
				if(key == KeyEvent.VK_S && tempObject.getY() < 287) tempObject.setY(tempObject.getY() + 20);
			}
			if(tempObject.getID() == ID.PlayerTwo)
			{
				if(key == KeyEvent.VK_UP && tempObject.getY() > 0) tempObject.setY(tempObject.getY() - 20);
				if(key == KeyEvent.VK_DOWN && tempObject.getY() < 287) tempObject.setY(tempObject.getY() + 20);
			}
			if(tempObject.getID() == ID.Ball)
			{
				if(key == KeyEvent.VK_1){
					gameStarted = true;
					//1 player
				}
				
				if(key == KeyEvent.VK_2 && !gameStarted)
				{
					gameStarted = true;
					if(Math.random() >= 0.5) tempObject.setVelX((int) Math.random()*2+1);
					else tempObject.setVelX((int) Math.random()*2+1);
					tempObject.setVelY(1);
				}
			}
			
		}
	}
	
	public void keyReleased(KeyEvent e)
	{
		int key = e.getKeyCode();
	}
	
}