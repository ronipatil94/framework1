package complieTimeexcep;

public class Mapcom 
{
	static void direction() throws MapException
	{
		String S="from hosahalli to vijayanagar";
		if(S=="from hosahalli to KBS")
		{
			System.out.println("correct direction");
		}
		else
		{
			throw new MapException("wrong direction");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			direction();
		}
		catch(MapException e)
		{
			System.out.println(e.getMessage());
		}
	}
	}
	class MapException extends Exception
	{
		String map;
		MapException(String map)
		{
			this.map=map;
		}
		public String getMessage()
		{
			return map;
		}
}