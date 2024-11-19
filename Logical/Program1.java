package Logical;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// factorial of a number
		
		System.out.println("enter  a number: ");
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" is "+fact);
		
	}

}
