package PrimeNo;

public class PrimeNo1_100 {

	public static void Primeno(int SN, int EN) {

		System.out.print("Prime no are ");
		for (int no = 1; no <= 100; no++) 
		{
			int primeno = 0;
			for (int j = 1; j <= no; j++) 
			{
				if (no % j == 0) {
					primeno++;
				}
			}
			if (primeno == 2) {
				System.out.print(" " + no);
			}
		}

	}

	public static void main(String[] args) {
		Primeno(1, 100);

	}

}
