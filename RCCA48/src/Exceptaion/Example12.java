package Exceptaion;

public class Example12 
{
	public static void main(String[] args) 
	{
		System.out.println("-----ms----");
		try
		{
			int x=1/0;
		}
		catch (ArithmeticException e) 
		{
			System.out.println("handled");
		
		}
		finally 
		{
			System.out.println("nanidini tale kedskobeda");
			
		}
		System.out.println("-----me-------");
	}


}
