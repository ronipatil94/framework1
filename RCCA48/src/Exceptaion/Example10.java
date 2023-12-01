package Exceptaion;

public class Example10 {

	public static void main(String[] args) 
	{
		System.out.println("-----ms----");
		try
		{
			int x=1/0;
			System.out.println("HI");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		System.out.println("-----me-------");
		
	}

}
