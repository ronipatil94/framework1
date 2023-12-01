package Encapsulation;

class Sample3 {
	private int a = 10;

	public int getA() 
	{
		return a;
	}

	public void setB(int a) 
	{
		this.a = a;
	}

}

public class Mainclass 
{
	public static void main(String[] args) 
	{
		Sample3 s = new Sample3();
		System.out.println(s.getA());

	}

}
