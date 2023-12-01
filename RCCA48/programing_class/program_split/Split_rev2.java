package program_split;

public class Split_rev2 
{
	public static void main(String[] args) 
	{
		String s= "Welcome to Bengalore";
		String[] arr=s.split(" ");
		
		for (int i = arr.length-1; i >=0; i--) 
		{
			if (i==1)
			{
				String a=arr[i];
				
				String  rev="";
				
				for (int j = a.length()-1; j >=0; j--) 
				{
					rev = rev +a.charAt(j);									
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
