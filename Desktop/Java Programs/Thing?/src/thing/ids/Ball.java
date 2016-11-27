package thing.ids;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import thing.main.Handler;
import thing.main.ID;
import thing.main.Object;

public class Ball extends Object{
	
	private Handler handler;
	private long rallyCount = 0;
	boolean tf = false;
	public int rightScore = 0;
	public int leftScore = 0;
	Score sc;
	
	public Ball(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(rallyCount == Math.round(Math.random()*2+2))
		{
			if(velX < 0) velX--;
			else if(velX > 0) velX++;
			rallyCount = 0;
		}
		if(y <= 0 || y - 16 >= 315) velY *= -1;
	
		for(int i = 0; i < handler.object.size(); i++)
		{
			Object tempObject = handler.object.get(i);
			if(tempObject.getID() == ID.PlayerOne || tempObject.getID() == ID.PlayerTwo)
			{
				if(tempObject.getBounds().intersects(getBounds()))
				{
					velX *= -1;
					rallyCount++;
				}
			}
		}
	}

	public Rectangle getBounds()
	{
		return new Rectangle(x, y, 16, 16);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 16, 16);
	}

}
