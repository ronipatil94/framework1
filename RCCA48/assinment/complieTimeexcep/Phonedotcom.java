package complieTimeexcep;

public class Phonedotcom 
{
	static void recharge() throws PhonepayException
	{
		int pack=209;
		if(pack>210)
		{
			System.out.println("Recharge is successfull");
		}
		else
		{
			throw new PhonepayException("Invalid pack");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			recharge();
		}
		catch(PhonepayException e)
		{
			System.out.println(e.getMessage());
		}
	}
	}
	class PhonepayException extends Exception
	{
		String price;
		PhonepayException(String price)
		{
			this.price=price;
		}
		public String getMessage()
		{
			return price;
		}
}
