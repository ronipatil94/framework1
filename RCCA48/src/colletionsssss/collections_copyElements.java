package colletionsssss;

import java.util.ArrayList;

public class collections_copyElements 
{
	public static void main(String[] args) 
	{
		ArrayList l1=new ArrayList();
		
		l1.add(2);
		l1.add("HI");
		l1.add(45);
		l1.add('s');
		l1.add("i love you");
		
		ArrayList l2=new ArrayList(l1);
		System.out.println("l1---->"+l1);
		System.out.println("l2---->"+l2);
		
		
	}

}
