import java.util.ArrayList;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr= {7,6,9,2};
		
		ArrayList l1= new ArrayList();
		
		for (int i = 0; i < arr.length; i++) 
		{
			l1.add(arr[i]);
			
		}
		for(int i=1;i<=10;i++) {
			
			if(!l1.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
