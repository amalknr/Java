package Logical;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// A number is paliandrome or not
		
		System.out.println("Enter an element");
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0) {
			int q=num%10;
			sum=(sum*10)+q;
			num=num/10;
		}
		if(sum==temp) {
		System.out.println("its paliandrome");
		}
		else {
			System.out.println("its not paliandrome");
		}
		
	}

}
