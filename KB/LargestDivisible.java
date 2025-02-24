package KB;

public class LargestDivisible {

	public static void main(String[] args) {
		// Largest One Divisible by 3
		
		int [] numbers= {35,15,25,24,34,20};
		int largest=0;
		
		for(int number : numbers) {
			if(number>largest && number%3==0) {
				largest=number;
			}
		}
		System.out.println(largest);

	}

}
