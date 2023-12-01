package Encapsulation;

 class ICICI
{
	private int ATM_PIN=1234;
	public int getAMT_PIN() 
	{
		return ATM_PIN;

	}
	public void setATM_PIN(int ATM_PIN) 
	{
		this.ATM_PIN = ATM_PIN;
	}
}
	public class ICICI_MAIN 
	{
	public static void main(String[] args) 
	{
		ICICI I = new ICICI();
		System.out.println(I.getAMT_PIN());
		I.setATM_PIN(4312);
		System.out.println(I.getAMT_PIN());
		
	}

}
