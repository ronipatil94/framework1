package PrimeNo;

public class Non_primeno1_100 {
	
	static void nonprimeno(int SN,int EN) 
	{
		System.out.print("Non Prime no are ");
		for(int no=1;no<=100;no++) 
		{
			int primeno = 0;
			for(int i=1;i<=no;i++) 
			{
				
				if(no%i==0) {
					
					primeno++;
				}
			}
			if(primeno!=2) 
			{
				System.out.print(" "+no);
				
			}
		}
	}

	public static void main(String[] args) 
	{
		nonprimeno(1,100);
		

	}

}
