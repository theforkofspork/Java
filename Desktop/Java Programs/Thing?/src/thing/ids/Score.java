package thing.ids;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

import thing.main.ID;
import thing.main.Object;

public class Score extends Object{

	private int rightScore = 0;
	private int leftScore = 0;
	boolean side = false;
	
	public Score(int x, int y, ID id, boolean side) {
		super(x, y, id);
		this.side = side;
	}

	public void tick() {
		
	}

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("Aldrich", Font.PLAIN, 64));
		if(side) g.drawString(String.valueOf(rightScore), x, y);
		else g.drawString(String.valueOf(leftScore), x, y);
	}

	public Rectangle getBounds() {
		return null;
	}
	
}