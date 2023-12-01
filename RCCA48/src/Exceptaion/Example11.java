package Exceptaion;

public class Example11 {

	public static void main(String[] args) 
	{

		System.out.println("-----ms----");
		try
		{
			System.out.println("HI");
			int x=1/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		System.out.println("-----me-------");
		
	}

}
