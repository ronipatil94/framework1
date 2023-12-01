package Classwork_programs;

public class Arraay 
{
	public static void main(String[] args) {
		
//		int[] arr={10,40,60,80,20};
//		
//		for (int i = 0; i < arr.length; i++)
//		{
//			if(arr[i]%2=0)
//			{
//				
//			}
//			
//		}
		int no=1234;
		int sum=0; 
		while(no!=0)
		{
			
			int rem=no%10;			
			sum=sum+rem;
			no=no/10;
			
		}
		System.out.println(sum);
		
	}

}
