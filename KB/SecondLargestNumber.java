package KB;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int [] num= {35,25,24,34,20};
		
		int largest=0;
		int SecondLargest=0;
		
		for(int number : num) {
			if(number>largest) {
				SecondLargest=largest;
				largest=number;
			}
			else if(number>SecondLargest && number!=largest) {
				SecondLargest=number;
			}
		}
		if(SecondLargest==largest || SecondLargest==0) {
			System.out.println("There is no SecondLargest Number");
		}
		else {
			System.out.println("SecondLargestNumber is : "+SecondLargest);
		}

	}

}
