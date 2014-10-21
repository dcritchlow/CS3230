import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tile extends JPanel
{
//	static
//	{
			int[] xPoints = {20, 20, 25, 25};
			int[] yPoints = {90, 30, 20,80};
			Polygon tileBottom = new Polygon(xPoints, yPoints, 4);
			int[] xPointsMid = {30, 30, 35, 35};
			int[] yPointsMid = {80, 20, 10,70};
			Polygon tileMiddle = new Polygon(xPointsMid, yPointsMid, 4);
//	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
//		int xpoints[] = {25,55,30,60};
//		int ypoints[] = {25,145,25,145};
//		int npoints = 4;
//		
//		g.drawPolygon(xpoints, ypoints, npoints);
		
//		g.drawRect(20, 50, 5, 75);
//		g.drawRect(7, 10, 80, 70);
		
//		int[] xpoints = {20, 20, 30, 30};
//		int[] ypoints = {80, 20, 10,70};
//		Polygon mySide = new Polygon(xpoints, ypoints, 4);
//		g.drawPolygon(mySide);
		
		g.drawPolygon(tileBottom);
		g.drawPolygon(tileMiddle);
		
		Graphics2D	g2 = (Graphics2D)g;
//		GradientPaint	grad = new GradientPaint(50, 50, Color.WHITE,
//					250, 250, Color.GREEN);
//		g2.setPaint(grad);
//		g.fillRect(50, 50, 200, 200);
	}
	
	public boolean matches(Tile other)
	{
		return this.getClass().equals(other.getClass());
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

//		frame.setLayout(new FlowLayout());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tile");
		frame.setSize(400, 400);
		frame.add(new Tile());
//		frame.pack();
		frame.setVisible(true);
	}
}
