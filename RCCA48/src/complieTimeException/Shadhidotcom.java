package complieTimeException;



public class Shadhidotcom 
{
	static void submit() throws ShadhiException
	{
		int age=17;
		if(age>21)
		{
			System.out.println("sukha jeevana");
		}
		else
		{
			throw new ShadhiException("invaild age");
		}
	}
	public static void main(String[] args)
	{
		try
		{
			submit();
		}
		catch(ShadhiException e)
		{
			System.out.println(e.getmessage());
		}
		
	}

}
class ShadhiException extends Exception
{
	String msg;
	ShadhiException(String msg)
	{
		this.msg=msg;
	}
	public  String getmessage()
	{
		return msg;
	}
}
