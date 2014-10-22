import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;


public abstract class Tile extends JPanel
{
	public 	final static Color 		DARKGREEN  	= new Color(0, 139, 0);
	public 	final static Color 		LIGHTGREEN 	= new Color(0, 255, 0);
	public	final static Dimension	SIZE 		= new Dimension(92, 98);
	
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
		
		int[] xPoints = {0, 0, 10, 10};
		int[] yPoints = {90, 20, 10, 80};
		Polygon tileBottom = new Polygon(xPoints, yPoints, 4);
		int[] xPointsMid = {10, 10, 20, 20};
		int[] yPointsMid = {80, 10, 0, 70};
		Polygon tileMiddle = new Polygon(xPointsMid, yPointsMid, 4);
		int[] xPointsSide = {80, 10, 0, 70};
		int[] yPointsSide = {80, 80, 90, 90};
		Polygon tileSide = new Polygon(xPointsSide, yPointsSide, 4);
		int[] xPointsSide2 = {90, 20, 10, 80};
		int[] yPointsSide2 = {70, 70, 80, 80};
		Polygon tileSide2 = new Polygon(xPointsSide2, yPointsSide2, 4);
		
		Graphics2D	g2 = (Graphics2D)g;
		GradientPaint	grad = new GradientPaint(0, 0, DARKGREEN,
					0, getHeight()/2, LIGHTGREEN, true);
		g2.setPaint(grad);
		
		g.fillPolygon(tileBottom);
		g.fillPolygon(tileSide);
		
		g2.setPaint(Color.WHITE);
		g.fillRect(20, 0, 70, 70);
		g.fillPolygon(tileMiddle);
		g.fillPolygon(tileSide2);
		
		g2.setPaint(Color.BLACK);
		g.drawPolygon(tileBottom);
		g.drawPolygon(tileMiddle);
		g.drawPolygon(tileSide);
		g.drawPolygon(tileSide2);
		g.drawRect(20, 0, 70, 70);
		g2.dispose();
	}
	
	public boolean matches(Tile other)
	{
		return this.getClass().equals(other.getClass());
	}
	
//	public static void main(String[] args)
//	{
//		JFrame	frame = new JFrame();
//
//		frame.setLayout(new FlowLayout());
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setTitle("Tile");
//		frame.add(new Tile());
//		frame.pack();
//		frame.setVisible(true);
//	}
}
