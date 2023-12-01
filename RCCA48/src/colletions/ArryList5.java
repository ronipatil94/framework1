package colletions;

import java.util.ArrayList;

public class ArryList5 {

	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		
		l1.add(2);
		l1.add("HI");
		l1.add(45);
		l1.add('s');
		l1.add(59.6);
		
		l1.remove("HI");		
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);

	}

}
