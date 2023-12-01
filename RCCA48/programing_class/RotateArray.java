import java.util.Iterator;

public class RotateArray {
	
	static int[] rotate(int arr[],int times)
	{
		for (int i = 1; i <=times; i++) 
		{
			final int temp=arr[0];
			for (int j = 0; j < arr.length-1; j++) {
				
				 arr[j]=arr[j+1];
			}
			arr[arr.length-1]=temp;
		}
		
		
		return arr;
		
	}

	public static void main(String[] args) {
		
		int[] arr= {5,6,4,5,7};
		int[] abb=rotate(arr,2);
		
		for (int i : abb) {
			System.out.print(i+" ");
		}

	}

}
