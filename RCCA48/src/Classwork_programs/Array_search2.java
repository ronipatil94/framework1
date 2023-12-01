package Classwork_programs;

public class Array_search2 
{

	public static void main(String[] args)
	{
		int[] arr={10,40,60,80,20};
		int largest =arr[0];
		int smallest=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]>largest ) 
			{
				largest=arr[i];
			}
			else if(arr[i]<smallest) 
			{
				smallest=arr[i];
			}
		}
			int sum=largest+smallest;
			System.out.println(sum);

	}

}
