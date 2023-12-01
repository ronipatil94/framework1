package Exceptaion;

public class Arry_OFBE {

	public static void main(String[] args) 
	{
		System.out.println("-----ms----");
		int[] arr= {1,4,3,7,2};
		
		try
		{
			System.out.println(arr[8]);;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled");
		}
		System.out.println("-----me-------");
		

	}

}
