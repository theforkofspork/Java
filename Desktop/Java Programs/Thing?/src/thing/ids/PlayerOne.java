package thing.ids;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import thing.main.ID;
import thing.main.Object;

public class PlayerOne extends Object{

	public PlayerOne(int x, int y, ID id) {
		super(x, y, id);
	}

	public void tick() {
		
	}
	
	public Rectangle getBounds()
	{
		return new Rectangle(x, y, 8, 72);
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, 8, 72);
	}

}
