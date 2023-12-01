package program_split;

public class Split_rev3 
{

	public static void main(String[] args) 
	{
		String s= "Welcome to Bangalour";
		
		String[] arr =s.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			if(i==1)
			{
				String a=arr[i];
				String rev ="";
				for (int j = a.length()-1; j >=0; j--)
				{
					 rev =rev+a.charAt(j);
					  
					
				}
				System.out.print(rev+" ");
			}
			else 
			{
				System.out.print(arr[i]+" ");
				
			}
		}
		
		
		
	}

}
