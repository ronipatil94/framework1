package Exceptaion;

public class String_IOFBE {

	public static void main(String[] args) 
	{
		System.out.println("-----ms----");
		String s= "javamava";
		
		try
		{
			System.out.println(s.charAt(12));;
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Handled");
		}
		System.out.println("-----me-------");
	}

}
