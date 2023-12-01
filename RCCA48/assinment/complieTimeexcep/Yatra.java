package complieTimeexcep;

public class Yatra 
{
	static void booking() throws YatraException
	{
		int price=500;
		if(price>520)
		{
			System.out.println("From Bangalore to Tirupati");
		}
		else
		{
			throw new YatraException("Not Booked");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			booking();
		}
		catch(YatraException e)
		{
			System.out.println(e.getMessage());
		}
	}
	}
	class YatraException extends Exception
	{
		String travel;
		YatraException(String travel)
		{
			this.travel=travel;
		}
		public String getMessage()
		{
			return travel;
		}
}
