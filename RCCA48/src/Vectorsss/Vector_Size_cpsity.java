package Vectorsss;

import java.util.Vector;

public class Vector_Size_cpsity {

	public static void main(String[] args) 
	{
		Vector l1 =new Vector(4);
		l1.add(2);
		l1.add(6);
		l1.add(5);
		System.out.println("capacity---->"+l1.capacity());
		System.out.println("size---->"+l1.size());
		l1.add(8);	
		System.out.println("capacity---->"+l1.capacity());
		System.out.println("size---->"+l1.size());
	

	}

}
