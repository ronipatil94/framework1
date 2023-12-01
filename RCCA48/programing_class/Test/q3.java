package Test;

public class q3 {

	public static void main(String[] args) {
		int[]arr = {123,121,145,141};
		
		for (int i = 0; i < arr.length; i++)
		{
			int no = arr[i];
			int rev=0;
			int copy=no;
			
			while(no!=0)
			{
				int rem=no%10;
				rev=(rev*10)+rem;
				no=no/10;
			}
			if(rev==copy)
			{
				System.out.println(arr[i]);
			}
			
			
		}
		

	}

}
