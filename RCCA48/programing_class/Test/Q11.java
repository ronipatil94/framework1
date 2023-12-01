package Test;

public class Q11 {

	public static void main(String[] args) 
	{
		String s="HeLLO";
		
		
		
		for (int i = 0; i <s.length(); i++) 
		{
			
			if(i==1) 
			{
				char c=s.charAt(i);
				c= (char)(c-32);
			System.out.print(c);
			}
			else
			{
				char c=s.charAt(i);
				c =(char)(c+32);
				System.out.print(c);
			}
						 
			
		}
		
	}

}
