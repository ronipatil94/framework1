package Encapsulation;


class Phonepe_UPI
{
	
	private  int UpiPin =741579;
	
	public int getUpiPin() 
	{
		return UpiPin;
	}
	public void setUpiPin(int UpiPin) 
	{
		this.UpiPin=UpiPin;
	}	
	
}

public class Main_UPI 
{

	public static void main(String[] args) 
	{
		Phonepe_UPI P =new Phonepe_UPI();
		System.out.println(P.getUpiPin());
		
				P.setUpiPin(987456);
		System.out.println(P.getUpiPin());
		
	}

}
