package Logical;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// Amstrong Number, 153 is an Amstrong number because 1^3+5^3+3^3=153
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int q,r;
		int temp=num;
		int sum=0;
		while(num !=0) {
			r=num%10;
			q=r*r*r;
			sum=sum+q;
			num=num/10;
		}
		if(sum ==temp) {
			System.out.println("its an amstrong number");
		}
		else {
			System.out.println("its not an amstrong number");
		}
		sc.close();
	}

}
