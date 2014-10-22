import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class CharacterTile extends AbstractCharacterTile
{
	private String chineseSymbol;

	static
	{
//		HashMap<String, String> chineseChars = new HashMap<String, String>();
//		chineseChars.put("1", "\u4E00");
//		chineseChars.put("2", "\u4E8C");
//		chineseChars.put("3", "\u4E09");
//		chineseChars.put("4", "\u56DB");
//		chineseChars.put("5", "\u4E94");
//		chineseChars.put("6", "\u516D");
//		chineseChars.put("7", "\u4E03");
//		chineseChars.put("8", "\u516B");
//		chineseChars.put("9", "\u4E5D");
//		chineseChars.put("North", "5317");
//		chineseChars.put("East", "6771");
//		chineseChars.put("West", "897F");
//		chineseChars.put("South", "5357");
//		chineseChars.put("Red", "4E2D");
//		chineseChars.put("Green", "767C");
//		chineseChars.put("wan", "842C");
	}
	public CharacterTile(char symbol) 
	{
		super(symbol);
		setToolTipText(toString());
		chineseSymbol = Tile.chineseChars.get(Character.toString(symbol));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Font f = g.getFont();
		FontMetrics fm = g.getFontMetrics();
		int wid = fm.stringWidth(chineseSymbol);
		
		g.setColor(Color.RED);
		g.drawString(Character.toString(symbol), 75, 15);
		
		if (symbol >= '1' && symbol <= '9') 
		{
			g.setColor(Color.BLACK);
			f = f.deriveFont(f.getSize2D() * 2F);
			g.setFont(f);
			g.drawString( chineseSymbol, (getWidth() - (wid - 12)) / 2, getHeight() / 4);
		}
		if (symbol == 'N' || symbol == 'E' || symbol == 'W' || symbol == 'S' )
		{
			g.setColor(Color.BLACK);
			f = f.deriveFont(f.getSize2D() * 4F);
			g.setFont(f);
			g.drawString( chineseSymbol, (getWidth() - (wid + 15)) / 2, getHeight() / 2);
		}
		
		
		
		

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
		// scroller.setPreferredSize(new Dimension(15 * 92, 40 + 98));

		tiles.add(new CharacterTile('1'));
		tiles.add(new CharacterTile('2'));
		tiles.add(new CharacterTile('3'));
		tiles.add(new CharacterTile('4'));
		tiles.add(new CharacterTile('5'));
		tiles.add(new CharacterTile('6'));
		tiles.add(new CharacterTile('7'));
		tiles.add(new CharacterTile('8'));
		tiles.add(new CharacterTile('9'));
		tiles.add(new CharacterTile('N'));
		tiles.add(new CharacterTile('E'));
		tiles.add(new CharacterTile('W'));
		tiles.add(new CharacterTile('S'));
		tiles.add(new CharacterTile('C'));
		tiles.add(new CharacterTile('F'));
		frame.pack();
		frame.setVisible(true);
	}
}
