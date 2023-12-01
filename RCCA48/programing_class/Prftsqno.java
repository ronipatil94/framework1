
public class Prftsqno {

	public static void main(String[] args) 
	{
		//for(int i=1;i<=100;i++)
		//{
			int no=30;
			
			int num=(int)Math.sqrt(no);
			
			if(num*num==no)
			{
				System.out.println(no+" its a perfect sq no");
			}
			else
			{
				int no2=num*num;
				System.out.println(no2);
				int no3=(num+1)*(num+1);
				System.out.println(no3);
			}
	}

}
