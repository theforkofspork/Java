import java.applet.Applet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
public class mainClass extends Applet 
{
	int[][] tilePlacement = new int[4][4];
	int repaintCount = 0;
	boolean paintTiles = false;
	
	public void paint(Graphics g)
	{
		setSize(500,500);
		setBackground(Color.lightGray);
		if(repaintCount == 1)
		{
			Graphics2D g2 = (Graphics2D)g;
			g2.setColor(Color.gray);
			g2.fill(new RoundRectangle2D.Float(50, 50, 395, 395, 30, 30));
			g2.setColor(Color.LIGHT_GRAY.darker());
			g2.fill(new RoundRectangle2D.Float(65,65,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(160,65,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(255,65,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(350,65,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(65,160,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(160,160,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(255,160,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(350,160,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(65,255,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(160,255,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(255,255,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(350,255,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(65,350,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(160,350,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(255,350,80,80,20,20));
			g2.fill(new RoundRectangle2D.Float(350,350,80,80,20,20));
		}
		if(paintTiles)
		{
			if(tilePlacement[1][1] > 0){
				
			}
			if(tilePlacement[2][1] > 0){
				
			}
			if(tilePlacement[3][1] > 0){
				
			}
			if(tilePlacement[4][1] > 0){
	
			}
			if(tilePlacement[1][2] > 0){
	
			}
			if(tilePlacement[2][2] > 0){
	
			}
			if(tilePlacement[3][2] > 0){
	
			}
			if(tilePlacement[4][2] > 0){
				
			}
			if(tilePlacement[1][3] > 0){
				
			}
			if(tilePlacement[2][3] > 0){
				
			}
			if(tilePlacement[3][3] > 0){
				
			}
			if(tilePlacement[4][3] > 0){
	
			}
			if(tilePlacement[1][4] > 0){
	
			}
			if(tilePlacement[2][4] > 0){
	
			}
			if(tilePlacement[3][4] > 0){
	
			}
			if(tilePlacement[4][4] > 0){
				
			}


		}
		
		repaintCount++;
	}
}
