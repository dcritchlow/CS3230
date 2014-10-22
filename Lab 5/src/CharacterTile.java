import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class CharacterTile extends AbstractCharacterTile
{

	public CharacterTile(char symbol) 
	{
		super(symbol);
		setToolTipText(toString());
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawString("TeXt", 15, 15);

	}
	
	public static void main(String[] args)
	{
		JFrame		frame = new JFrame();
		JPanel		tiles = new JPanel();
		JScrollPane	scroller = new JScrollPane(tiles);
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Character Tiles");
		frame.add(scroller);

		// Try something like this if your tiles don't fit on the screen.
		// Replace "tile width" and "tile height" with your values.
		// scroller.setPreferredSize(new Dimension(8 * 120, 40 + 110));

		tiles.add(new CharacterTile('1'));
//		tiles.add(new CharacterTile('2'));
//		tiles.add(new CharacterTile('3'));
//		tiles.add(new CharacterTile('4'));
//		tiles.add(new CharacterTile('5'));
//		tiles.add(new CharacterTile('6'));
//		tiles.add(new CharacterTile('7'));
//		tiles.add(new CharacterTile('8'));
//		tiles.add(new CharacterTile('9'));
//		tiles.add(new CharacterTile('N'));
//		tiles.add(new CharacterTile('E'));
//		tiles.add(new CharacterTile('W'));
//		tiles.add(new CharacterTile('S'));
//		tiles.add(new CharacterTile('C'));
//		tiles.add(new CharacterTile('F'));
		frame.pack();
		frame.setVisible(true);
	}
}
