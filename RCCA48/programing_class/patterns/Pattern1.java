package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int no=1;
		char ch='A';
		for(int i=1; i<=4;i++) 
		{
			for(int j=1;j<=4;j++) 
			{
				if(i%2==1) {
					System.out.print(no++ +" ");
				}
				else {
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}

	}

}
