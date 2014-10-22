import java.util.HashMap;
import java.util.Objects;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public abstract class AbstractCharacterTile extends Tile
{
	protected char symbol;
	
//	static
//	{
//		HashMap chineseChars = new HashMap<String, String>();
//		chineseChars.put("1", "4E00");
//		chineseChars.put("2", "4E8C");
//		chineseChars.put("3", "4E09");
//		chineseChars.put("4", "56DB");
//		chineseChars.put("5", "4E94");
//		chineseChars.put("6", "516D");
//		chineseChars.put("7", "4E03");
//		chineseChars.put("8", "516B");
//		chineseChars.put("9", "4E5D");
//		chineseChars.put("North", "5317");
//		chineseChars.put("East", "6771");
//		chineseChars.put("West", "897F");
//		chineseChars.put("South", "5357");
//		chineseChars.put("Red", "4E2D");
//		chineseChars.put("Green", "767C");
//		chineseChars.put("wan", "842C");
//	}
	
	public AbstractCharacterTile(char symbol)
	{
		this.symbol = symbol;
	}
	
	@Override
	public boolean matches(Tile other)
	{
		AbstractCharacterTile otherObject = (AbstractCharacterTile) other;
		return super.matches(other)
				&& symbol == otherObject.symbol
				&& Objects.equals(symbol, otherObject.symbol);
	}

	@Override
	public String toString()
	{
		if (symbol >= '1' && symbol <= '9')
		{
			return "Character " + symbol;
		}
		else if (symbol == 'N')
		{
			return "North Wind";
		}
		else if (symbol == 'E')
		{
			return "East Wind";
		}
		else if (symbol == 'W')
		{
			return "West Wind";
		}
		else if (symbol == 'S')
		{
			return "South Wind";
		}
		else if (symbol == 'C')
		{
			return "Red Dragon";
		}
		else if (symbol == 'F')
		{
			return "Green Dragon";
		}
		else
		{
			return "Invalid Character symbol";
		}
	}
	
//	public static void main(String[] args)
//	{
//		JFrame		frame = new JFrame();
//		JPanel		tiles = new JPanel();
//		JScrollPane	scroller = new JScrollPane(tiles);
//
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setTitle("Character Tiles");
//		frame.add(scroller);
//
//		// Try something like this if your tiles don't fit on the screen.
//		// Replace "tile width" and "tile height" with your values.
//		// scroller.setPreferredSize(new Dimension(8 * 120, 40 + 110));
//
//		tiles.add(new CharacterTile('1'));
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
//
//		frame.pack();
//		frame.setVisible(true);
//	}
}
