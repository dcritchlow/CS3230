import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;


public class CircleTile extends RankTile
{
	final Circle circles[] = new Circle[9];
	
	public CircleTile(int rank)
	{
		super(rank);
		setToolTipText(toString());
		circles[rank -1] = new Circle(25, 25, Color.BLACK);
	}

	@Override
	public String toString()
	{
		return "Circle " + rank ;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		for (Circle c : circles)
			if (c != null)
				c.draw(g);
	}
	
	public static void main(String[] args)
	{
		JFrame	frame = new JFrame();

		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Circle Tiles");

		frame.add(new CircleTile(1));
		frame.add(new CircleTile(2));
		frame.add(new CircleTile(3));
		frame.add(new CircleTile(4));
		frame.add(new CircleTile(5));
		frame.add(new CircleTile(6));
		frame.add(new CircleTile(7));
		frame.add(new CircleTile(8));
		frame.add(new CircleTile(9));

		frame.pack();
		frame.setVisible(true);
	}
}
