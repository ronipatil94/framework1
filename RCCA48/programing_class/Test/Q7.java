package Test;

public class Q7 {

	public static void main(String[] args) {
		int[]arr = {1,4,3,2,6,7};
		
		int sum=0;
		
		for (int i = arr.length-1; i >=0 ; i--) {
			
			
			if(arr[i]%2==0) 
			{
				sum=sum+arr[i];
			}
			
		}
		System.out.println(sum);

	}

}
