package KB;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		//find the second largest number in an array without sorting,storing and using a single loop in java
		
		int number=151;
		int temp=number;
		
		int q=0;
		int sum=0;
		
		while(number!=0) {
			q=number % 10;
			sum=(sum*10)+q;
			number=number/10;
		}
		if(sum==temp) {
			System.out.println("its paliandrom");
		}
		else {
			System.out.println("its not paliandrom");
		}

	}

}
