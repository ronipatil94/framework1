package Test;

public class Q10 {

	public static void main(String[] args) 
	{
		String s="hello";
		String s1="";
		
		
		for (int i = 0; i <s.length(); i++) 
		{
			char c=s.charAt(i);
			s1=s1+(char)(c-32);			 
			
		}
		System.out.print(s1);

	}

}
