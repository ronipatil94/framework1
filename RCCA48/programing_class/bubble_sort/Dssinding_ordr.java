package bubble_sort;

public class Dssinding_ordr
{
	public static void main(String[] args) 
	{
		int[] arr = {5,8,9,6,7,4};
		
		int n =arr.length;
		
		for (int i = 0; i < n-1; i++) 
		{
			for (int j = 0; j < n-1; j++) 
			{
				if (arr[j]<arr[j+1]) 
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;					
				}
				
			}
			
		}
		for (int k : arr) 
		{
			System.out.println(k);
			
		}
	}

}
