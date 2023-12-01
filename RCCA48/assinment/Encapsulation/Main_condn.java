package Encapsulation;

class Condition 
{
	private boolean A=true;
	public boolean getA()
	{
		return A;
	}
	public void setA(boolean A)
	{
		this.A=A;	
	}

}
public class Main_condn
{
	public static void main(String[] args)
	{
		Condition s=new Condition();
		System.out.println(s.getA());
		s.setA(false);
		System.out.println(s.getA());
}
}
