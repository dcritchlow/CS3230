import java.util.Objects;


public class CharacterTile extends Tile
{
	protected char symbol;
	
	public CharacterTile(char symbol)
	{
		this.symbol = symbol;
	}
	
	@Override
	public boolean matches(Tile other)
	{
		CharacterTile otherObject = (CharacterTile) other;
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
}
