package bubble_sort;

public class Assinding_order {

	public static void main(String[] args) 
	{
		int []arr= {2,5,6,8,4,9};
		
		int m=arr.length;
		
		for (int j = 0; j < m-1; j++) 
		{
			for (int i = 0; i < m-1; i++) 
			{
				if (arr[i]>arr[i+1]) 
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				
			}
			
		}
		for (int k:arr) 
		{
			System.out.println(k);
			
		}
		

	}

}
