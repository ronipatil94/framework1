package Exceptaion;

public class Example8 
{
	public static void main(String[] args) 
	{
		System.out.println("-----ms----");
		try
		{
			int x=1/0;
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}		
		//catch(ArithmeticException e)
		{
			System.out.println("Addressed");
		}
		System.out.println("-----me-------");

	}

}
