package complieTimeexcep;

public class Swiggy
{
	static void order() throws SwiggyException
	{
		String item="Dosa";
		if(item=="idli")
		{
			System.out.println("nice idli");
		}
		else
		{
			throw new SwiggyException("Dosa khaali");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			order();
		}
		catch(SwiggyException e)
		{
			System.out.println(e.getMessage());
		}
	}
	}
	class SwiggyException extends Exception
	{
		String Kali;
		SwiggyException(String Kali)
		{
			this.Kali=Kali;
		}
		public String getMessage()
		{
			return Kali;
		}
}