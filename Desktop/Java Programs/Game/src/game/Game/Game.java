package game.Game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;

public class Game {
	
	final int WIDTH = 500, HEIGHT = WIDTH/16*9;
	final Dimension SCREEN_RESOLUTION = Toolkit.getDefaultToolkit().getScreenSize();
	final Point CENTER_OF_SCREEN = new Point((int)SCREEN_RESOLUTION.getWidth()/2,(int)SCREEN_RESOLUTION.getHeight()/2);
	
	
	public Game()
	{
		new Frame(WIDTH, HEIGHT, "Frame", new Point(CENTER_OF_SCREEN.x - (WIDTH / 2), CENTER_OF_SCREEN.y - (HEIGHT / 2)));
	}
	
	
	//All methods go here
	
	
	
	public static void main(String[] args)
	{
		new Game();
	}
	
	
}
