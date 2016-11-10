import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
public class mainClass extends Applet 
{
	int[][] tilePlacement = new int[4][4];
	int repaintCount = 0;
	
	public void paint(Graphics g)
	{
		setSize(500,500);
		setBackground(Color.lightGray);
		
		if(repaintCount == 1)
		{
			Graphics2D g2 = (Graphics2D)g;
			g2.setColor(Color.gray);
			g2.fill(new RoundRectangle2D.Float(100, 100, 300, 300, 30, 30));
			g2.setColor(Color.LIGHT_GRAY.darker());
			g2.fill(new RoundRectangle2D.Float(120,125,60,60,20,20));
			g2.fill(new RoundRectangle2D.Float(185,125,60,60,20,20));
			g2.fill(new RoundRectangle2D.Float(250,125,60,60,20,20));
			g2.fill(new RoundRectangle2D.Float(315,125,60,60,20,20));
		}
		
		
		repaintCount++;
	}
	
}
