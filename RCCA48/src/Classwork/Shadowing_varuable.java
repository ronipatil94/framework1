package Classwork;

public class Shadowing_varuable 
{
	int a=9;
	int b=12;
	void disp()
	{
		int a=10;
		int b=20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		new Shadowing_varuable().disp();
	}
}
