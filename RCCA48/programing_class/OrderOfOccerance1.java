public class OrderOfOccerance1 {

	public static void main(String[] args) {
		String s="aaaiikkiiyyggbmn";
		
		int[]arr=new int[122];
		for(int i=0;i<s.length();i++) {
			
			char ch= s.charAt(i);
			arr[ch]++;
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=0) {
				System.out.println((char)i+" "+arr[i]);
			}
		}

	}

}
