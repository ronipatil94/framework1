package Encapsulation;

class facebook
{
	private String Pwd= "Barthiya";
	
	public String getPwd() 
	{
		return Pwd;
	}
	public void setPwd(String Pwd) 
	{
		this.Pwd=Pwd;
	}
	
	
}
public class Facebook_main {

	public static void main(String[] args) 
	{
		facebook f =new facebook();
		System.out.println(f.getPwd());
		f.setPwd("balarala");
		System.out.println(f.getPwd());
		

	}

}
