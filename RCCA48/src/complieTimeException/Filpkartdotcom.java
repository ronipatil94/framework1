package complieTimeException;

public class Filpkartdotcom 
{
	static void purchase() throws discountException
	{
		int discount=17;
		if(discount>21)
		{
			System.out.println("500rs discount");
		}
		else
		{
			throw new discountException("no discount");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			purchase();
		}
		catch(discountException e)
		{
			System.out.println(e.getmessage());
		}
		
	}

}
class discountException extends Exception
{
	String msg;
	discountException(String msg)
	{
		this.msg=msg;
	}
	public  String getmessage()
	{
		return msg;
	}
}



