package complieTimeexcep;

public class jio 
{
	static void watch() throws JiocinemaException
	{
		String kannada="kgf";
		if(kannada=="googli")
		{
			System.out.println("Super");
		}
		else
		{
			throw new JiocinemaException("Invalid Search");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			watch();
		}
		catch(JiocinemaException e)
		{
			System.out.println(e.getMessage());
		}
	}
	}
	class JiocinemaException extends Exception
	{
		String msg;
		JiocinemaException(String msg)
		{
			this.msg=msg;
		}
		public String getMessage()
		{
			return msg;
		}
}