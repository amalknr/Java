package Logical;

public class Program11 {
	
	public static String LargestNumber(String num,int maxswaps) {
		char[] digits=num.toCharArray();
		int n=digits.length;
		for(int i=0;i<n;i++) {
			if(maxswaps==0) {
				break;
			}
			
			int maxIndex=i;
			for(int j=i+1;j<n;j++) {
				if(digits[j]>digits[maxIndex]) {
				maxIndex=j;
				}
			}
			
			if(maxIndex != i) {
				char temp=digits[i];
				digits[i]=digits[maxIndex];
				digits[maxIndex]= temp ;
				
				maxIndex--;
			}
		}
		return new String(digits);
	}

	public static void main(String[] args) {
		// Find largest number in maximum 4 steps
		String num="1234567";
		int maxswaps=4;
		 String largestNumber = LargestNumber(num, maxswaps);
	        System.out.println("Largest number with at most 4 swaps: " + largestNumber);
		
		
	}

}
