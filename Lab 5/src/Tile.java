import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tile extends JPanel
{
	public 	final static Color 		DARKGREEN  	= new Color(0, 139, 0);
	public 	final static Color 		LIGHTGREEN 	= new Color(0, 255, 0);
	private	final static Dimension	SIZE 		= new Dimension(120,120);
	
	// static initialization block
	static
	{
		
	}
	
	public Tile()
	{
		setPreferredSize(SIZE);
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int[] xPoints = {20, 20, 30, 30};
		int[] yPoints = {100, 30, 20, 90};
		Polygon tileBottom = new Polygon(xPoints, yPoints, 4);
		int[] xPointsMid = {30, 30, 40, 40};
		int[] yPointsMid = {90, 20, 10, 80};
		Polygon tileMiddle = new Polygon(xPointsMid, yPointsMid, 4);
		int[] xPointsSide = {100, 30, 20, 90};
		int[] yPointsSide = {90, 90, 100, 100};
		Polygon tileSide = new Polygon(xPointsSide, yPointsSide, 4);
		int[] xPointsSide2 = {110, 40, 30, 100};
		int[] yPointsSide2 = {80, 80, 90, 90};
		Polygon tileSide2 = new Polygon(xPointsSide2, yPointsSide2, 4);
		
		Graphics2D	g2 = (Graphics2D)g;
		GradientPaint	grad = new GradientPaint(0, 0, DARKGREEN,
					0, getHeight()/2, LIGHTGREEN, true);
		g2.setPaint(grad);
		
		g.fillPolygon(tileBottom);
		g.fillPolygon(tileSide);
		
		g2.setPaint(Color.WHITE);
		g.fillRect(40, 10, 70, 70);
		g.fillPolygon(tileMiddle);
		g.fillPolygon(tileSide2);
		
		g2.setPaint(Color.BLACK);
		g.drawPolygon(tileBottom);
		g.drawPolygon(tileMiddle);
		g.drawPolygon(tileSide);
		g.drawPolygon(tileSide2);
		g.drawRect(40, 10, 70, 70);
		g2.dispose();
	}
	
	public boolean matches(Tile other)
	{
		return this.getClass().equals(other.getClass());
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tile");
		frame.add(new Tile());
		frame.pack();
		frame.setVisible(true);
	}
}
