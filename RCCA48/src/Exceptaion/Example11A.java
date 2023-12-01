package Exceptaion;

public class Example11A {

	public static void main(String[] args) {

		System.out.println("-----ms----");
		try
		{
			int x=1/0;
			int[] arr= {1,4,3,7,2};
			
			try
			{
				System.out.println(arr[8]);;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Handled");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		System.out.println("-----me-------");


	}

}
