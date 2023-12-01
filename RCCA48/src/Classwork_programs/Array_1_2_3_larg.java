package Classwork_programs;

public class Array_1_2_3_larg {
	public static void main(String[] args) {
		int[] msd = { 2, 17, 6, 3, 23 };
		int fl = 0;
		int sl = 0;
		int tl = 0;
		for (int i = 0; i < msd.length; i++) {
			if (msd[i] > fl) {
				tl = sl;
				sl = fl;
				fl = msd[i];
			} else if (msd[i] > sl) {
				tl = sl;
				sl = msd[i];

			} else if (msd[i] > tl) {
				tl = msd[i];
			}

		}
		System.out.println(fl);
		System.out.println(sl);
		System.out.println(tl);
	}
}
