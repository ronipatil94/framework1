package Classwork_programs;

public class Array_Vowals_INstring {

	public static void main(String[] args) {
		
		String[]arr= { "apple","yogi","roni","orange"};
		
		for (int i = 0; i < arr.length; i++) 
		{
			String s1 =arr[i];
			
			if(s1.charAt(0)=='a'||s1.charAt(0)=='o')
			{
				System.out.println(s1);
			
			
//			for (int j = 0; j <s1.length(); j++)
//			{
//				if(j==0)
//				{
//					if((s1.charAt(0)=='a')||(s1.charAt(0)=='o'))
//					{
//						System.out.println(s1);
//					}
//			}
			}
			
		}

	}

}
