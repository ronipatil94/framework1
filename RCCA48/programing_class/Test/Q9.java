package Test;

public class Q9 {

	public static void main(String[] args) 
	{
		int[]arr = {1,4,3,2,6,7};
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			int no=arr[i];
			int count=0;
			for (int j = 1; j <=no; j++) 
			{
				if(no%j==0) 
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+no;
			}		
			
		}
			System.out.println(sum);

	}

}
