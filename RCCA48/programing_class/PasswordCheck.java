
public class PasswordCheck {

	public static void main(String[] args) 
	{
		String s1="Roni@1194*)";
		final int numofUP=2;
		final int numofLC=2;
		final int numofDigit=2;
		final int numofSLP=2;
		
		int countofUP=0;
		int countofLC=0;
		int countofDigit=0;
		int countofSLP=0;
		
		if(s1.length()>=8&&s1.length()>=16)
		{
			for (int i = 0; i < s1.length(); i++) 
			{
				char ch=s1.charAt(i);
				if(Character.isUpperCase(ch))
				{
					countofUP++;
				}
				else if(Character.isLowerCase(ch))
				{
					countofLC++;
				}
				else if(Character.isDigit(ch))
				{
					countofDigit++;
				}
				else
				{
					countofSLP++;
				}
				
			}
			
		}
		else
		{
			
		}
		
		

	}

}
