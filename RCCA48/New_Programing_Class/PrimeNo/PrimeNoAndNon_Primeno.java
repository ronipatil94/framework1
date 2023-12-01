package PrimeNo;

public class PrimeNoAndNon_Primeno {

	static void PrimeAndNonPrimeNO(int SN,int EN) 
	{
		
		for(int no=SN;no<=EN;no++) 
		{
			int primeno = 0;
			for(int i=1;i<=no;i++) 
			{
				
				if(no%i==0) {
					
					primeno++;
				}
			}
			if(primeno==2) 
			{
				System.out.println("Prime no are "+no);
				
			}
			else 
			{
				System.out.println("non prime no are "+no);
			}
		}
	}
	public static void main(String[] args) 
	{
		PrimeAndNonPrimeNO(1,100);
	}

}
