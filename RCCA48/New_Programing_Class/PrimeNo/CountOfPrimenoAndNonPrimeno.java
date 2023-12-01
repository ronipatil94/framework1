package PrimeNo;

public class CountOfPrimenoAndNonPrimeno {
	static void Count(int SN, int EN) {
		int countOfprimeno = 0;
		int countOfNonPrimeno = 0;

		for (int no = SN; no <= EN; no++) {
			int primeno = 0;
			for (int i = 1; i <= no; i++) {

				if (no % i == 0) {

					primeno++;
				}
			}
			if (primeno == 2) {
				countOfprimeno++;

			} else {
				countOfNonPrimeno++;
			}
		}
		System.out.println("Primeno count is " + countOfprimeno);
		System.out.println("non Primeno count is " + countOfNonPrimeno);
	}

	public static void main(String[] args) {
		Count(1, 100);

	}

}
