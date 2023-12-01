package Exceptaion;

public class Example6 {

	public static void main(String[] args) 
	{
		System.out.println("-----ms----");
		try
		{
			int x=1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("addressed");
		}
		System.out.println("-----me-------");
		

	}

}
