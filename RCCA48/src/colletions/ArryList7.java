package colletions;

import java.util.ArrayList;

public class ArryList7 {

	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		
		l1.add(2);
		l1.add("HI");
		l1.add(45);
		l1.add('s');
		l1.add(59.6);
		
		ArrayList l2=new ArrayList();
		
		l2.add(3);
		l2.add("bye");
		l2.add(45);
		l2.add('k');
		l2.add(null);
		System.out.println("-----b4 retainall---");
		System.out.println("l1---->"+l1);
		System.out.println("l2---->"+l2);
		l1.removeAll(l2);
		System.out.println("-----after retainall---");
		System.out.println("l1---->"+l1);
		System.out.println("l2---->"+l2);
	
	

	}

}
