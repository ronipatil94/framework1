
public class FatchVowalString {

	public static void main(String[] args) 
	{
		String[] arr= {"roni","apple","elephanet"};
		
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i].charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o') {
				System.out.println(arr[i]);
			}
		}
		
	}

}
