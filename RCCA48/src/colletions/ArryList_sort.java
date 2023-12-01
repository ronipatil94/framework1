package colletions;

import java.util.ArrayList;
import java.util.Collections;

public class ArryList_sort {

	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		
		l1.add(2);
		l1.add(5);
		l1.add(6);
		l1.add(1);
		l1.add(9);
		
		System.out.println("-------b4 sort---- ");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("-------afttr sort---- ");
		System.out.println(l1);
	

	}

}
