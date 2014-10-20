
public abstract class PictureTile extends Tile
{
	private String name;
	
	public PictureTile(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name;
	}
	
	public static void main(String[] args)
	{
		// TODO Added optional main method
	}
}
