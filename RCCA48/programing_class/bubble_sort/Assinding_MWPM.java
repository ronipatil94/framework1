package bubble_sort;

public class Assinding_MWPM 
{
	public static int[] disp(int[] abb)
	{
		int m=abb.length;
		for (int i = 0; i < m-1; i++) 
		{
			for (int j = 0; j < m-1; j++) 
			{
				if(abb[j]>abb[j+1]) 
				{
				
				int temp =abb[j+1];
					abb[j+1]=abb[j];
					abb[j]=temp;				
				}
			}
		}
		return abb;
	}
		

	public static void main(String[] args) 
	{
		int []arr= {2,5,6,8,4,1};
		
		int[] acc=disp(arr);
		
		for (int k : acc)
		{
			System.out.println(k);
			
		}
	}

}
