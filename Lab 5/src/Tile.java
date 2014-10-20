import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public abstract class Tile extends JPanel
{
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
