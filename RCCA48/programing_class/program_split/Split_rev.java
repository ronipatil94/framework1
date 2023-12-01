package program_split;

public class Split_rev 
{

	public static void main(String[] args) 
	{
		String S= "nanna manasali ninge jaaga illa";
		String[] arr= S.split(" ");
		
		
		for (int i =  arr.length-1; i >= 0; i--) 
		{
			
			
			System.out.print(arr[i]+" ");
			
			
		}
		
	}

}
