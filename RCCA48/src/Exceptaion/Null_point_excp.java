package Exceptaion;

public class Null_point_excp 
{

	public static void main(String[] args) 
	{
		System.out.println("-----ms----");
		Null_point_excp p =null; 
		try
		{
			System.out.println(p.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled");
		}
		System.out.println("-----me-------");
	}

}
