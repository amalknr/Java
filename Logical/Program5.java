package Logical;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// prime or not
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		boolean isPrime=true;
		
		if(num<=1) {
			isPrime=false;
		}
		else {
			
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("its prime");
		}
		else {
			System.out.println("its not prime");
		}
		sc.close();
	}

}
