package Encapsulation;

class Mobile 
{
	private int pin =7866 ;

		public int getpin() 
		{
			return pin;
		}
		public void setpin(int pin) 
		{
			this.pin=pin;
		}
}
public class Main_mobile
{

	public static void main(String[] args) 
	{
	Mobile f =new Mobile();
	System.out.println(f.getpin());
	
	f.setpin(2546);
	System.out.println(f.getpin());
	

	}

}
