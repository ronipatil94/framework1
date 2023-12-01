

public class MarggingArray {

	public static void main(String[] args) {
		int[]arr= {10,20,30};
		int[]abb= {40,50,60};
		
		int ans[]=new int[arr.length+abb.length];
		int pos=0;
		
		
		for (int i : arr) 
		{
			
			ans[pos++]=i;
			
		}
		for (int j : abb) 
		{
			
			ans[pos++]=j;
	
		}
		for(int k:ans) {
			System.out.print(" "+k);
		}
	}
}
