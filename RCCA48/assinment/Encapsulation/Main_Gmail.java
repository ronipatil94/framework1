package Encapsulation;

class Gmail 
{
	private String b="123@nik";
	public String getb()
	{
		return b;
	}
	public void setb(String b)
	{
		this.b=b;	
	}

}
public class Main_Gmail
{
	public static void main(String[] args)
	{
		Gmail s=new Gmail();
		System.out.println(s.getb());
		s.setb("111@nike");
		System.out.println(s.getb());
}
}