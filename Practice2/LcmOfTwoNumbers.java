package Practice2;

import java.util.Scanner;

public class LcmOfTwoNumbers {
	public int Gcd(int a,int b) {
		while(b !=0) {
		int temp=b;
		b=a % b;
		a=temp;
		}
		return a;
	}
	public void lcm(int a,int b) {
		int c=(a*b)/Gcd(a,b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		LcmOfTwoNumbers obj=new LcmOfTwoNumbers();
		System.out.println(obj.Gcd(a, b));
		obj.lcm(a, b);
	}

}
