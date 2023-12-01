package Test;

public class Q12 {

	public static void main(String[] args) {
		
		String s="Hello How Are You";
	
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) 
		{
			String a=s1[i];
			  String a1="";
			String a2="";
			
			
			for (int j = 0; j < a.length(); j++) 
			{
				char c=s.charAt(j);
				if(j==0) 
				{
					 
				
				}
				else
				{
					
					c =(char)(c+32);
					System.out.print(c);
				}
				
			}
			
		}

	}

}
