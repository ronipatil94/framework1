
public class StrongNo {

	public static void main(String[] args) {
		int no=145;
		int copy=no;
		int sum=0;
		while (no!=0)
		{
			int rem=no%10;
			int fact=1;
			for (int i = rem; i <=1; i--) {
				
				fact=fact*i;
				
			}
			sum=sum+fact;
		}
		if(sum==copy) {
			
			System.out.println("its a strong number");
		}

	}

}
