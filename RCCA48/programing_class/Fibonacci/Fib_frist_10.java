package Fibonacci;

public class Fib_frist_10 {

	public static void main(String[] args) 
	{
		int fib1=0;
		int fib2=1;
		System.out.print(fib1+" "+fib2+" ");
		for (int i = 1; i <=10; i++) 
		{
			int fib3 =fib1+fib2;
			    fib1=fib2;
			    fib2=fib3;
			    System.out.print(fib3+" ");
		
			
			
		}
	}

}
