package Exceptaion;

public class Example7 {

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
		System.out.println("-----me-------"); 
	}

}
