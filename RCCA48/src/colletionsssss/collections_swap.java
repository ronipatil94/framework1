package colletionsssss;

import java.util.ArrayList;
import java.util.Collections;

public class collections_swap {

	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		
		l1.add(2);
		l1.add("HI");
		l1.add(45);
		l1.add('s');
		l1.add("i love you");
		
		System.out.println("-------b4 Swap---- ");
		System.out.println(l1);
		Collections.swap(l1,3,1);
		System.out.println("-------afttr Swap---- ");
		System.out.println(l1);
	}

}
