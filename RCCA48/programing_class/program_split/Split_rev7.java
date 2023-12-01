package program_split;

public class Split_rev7 
{
	public static void main(String[] args) 
	{
		String s= "Hi i am shyam";
		
		String[] arr=s.split(" ");
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(i==2)
			{
				System.out.print(arr[i].toUpperCase()+" ");
			}
			else
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
