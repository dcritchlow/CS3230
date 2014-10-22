import java.awt.Color;
import java.awt.Graphics;


public class WindAndDragonTile extends AbstractCharacterTile
{

	public WindAndDragonTile(char symbol) 
	{
		super(symbol);
		setToolTipText(toString());
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.drawString(Character.toString(symbol), 75, 15);

	}
}
