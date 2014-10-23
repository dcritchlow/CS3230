import java.awt.Color;
import java.awt.Graphics;


public class Circle
{
	private int x;
	private int y;
	private Color c;
	
	public Circle(int x, int y, Color c) 
	{
		super();
		this.x = x;
		this.y = y;
		this.c = c;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(c);
		g.drawOval(x, y, 5, 5);
	}
}
