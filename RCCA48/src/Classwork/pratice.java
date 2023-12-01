package Classwork;

public class pratice 
{
	public void finalize()
	{
		System.out.println("nan bande");
	}
	public static void main(String[] args)
	{
		pratice s1 = new pratice();
		pratice s2 = new pratice();
		pratice s3 = new pratice();
		pratice s4 = new pratice();
			   s1=null;
			   s2=null;
			   s3=null;
			   s4=null;
			   System.gc();
			   
			   
			   
		
	}

}
