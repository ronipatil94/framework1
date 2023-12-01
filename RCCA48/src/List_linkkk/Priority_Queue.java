package List_linkkk;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue 
{
	public static void main(String[] args) 
	{
		PriorityQueue p=new PriorityQueue();
		p.add(2);
		p.add(5);
		p.add(6);
		p.add(8);
		System.out.println("-------b4 peek---- ");
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println("-------afttr peek---- ");
		System.out.println(p);
		System.out.println(p.poll());
		System.out.println("-------afttr poll---- ");
		System.out.println(p);
		
		
		
	}
}
