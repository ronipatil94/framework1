package colletions;

import java.util.ArrayList;

public class ArryList12_set 
{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		
		l1.add(2);
		l1.add("HI");
		l1.add(45);
		l1.add('s');
		l1.add(59.6);
		
		System.out.println("-------b4 set()---- ");
		System.out.println(l1);
		l1.set(0, 8);
		System.out.println("-------afttr set()---- ");
		System.out.println(l1);
	}

}