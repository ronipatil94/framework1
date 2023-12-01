package colletionsssss;

import java.util.ArrayList;
import java.util.Collections;

public class collections_revarse2 {

	public static void main(String[] args) 
	{
	
		ArrayList l1=new ArrayList();
		
		l1.add(2);
		l1.add(5);
		l1.add(6);
		l1.add(1);
		l1.add(9);
		
		System.out.println("-------b4 revarse---- ");
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println("-------afttr revarse---- ");
		System.out.println(l1);

	}

}
