package colletions;

import java.util.ArrayList;

public class ArryList10 {

	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		
		l1.add(2);
		l1.add("HI");
		l1.add(45);
		l1.add('s');
		l1.add(59.6);
		
		System.out.println(l1.size());
		System.out.println();
		
		for (int i = 0; i < l1.size(); i++) 
		{
			System.out.println(l1.get(i));
			
		}
		

	}

}
