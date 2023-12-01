package Exceptaion;

public class Arith_exp {

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
		System.out.println("-----me-------");

	}

}
