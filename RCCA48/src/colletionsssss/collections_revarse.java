package colletionsssss;

import java.util.ArrayList;

public class collections_revarse {

	public static void main(String[] args) 
	{

		ArrayList l1=new ArrayList();
		
		l1.add(2);
		l1.add(5);
		l1.add(6);
		l1.add(1);
		l1.add(9);
		
		for (int i = l1.size()-1; i >=0; i--) 
		{
			System.out.println(l1.get(i));
			
		}

	}

}
