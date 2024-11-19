package Logical;

public class Program12 {
	public static int gcd(int a,int b) {
		while(b !=0 ) {
			int temp=b;
			b=a % b;
			a=temp;
		}
		return a;
	}
	
	public static int lcm(int a,int b) {
		return (a * b)/gcd(a,b);
	}

	public static void main(String[] args) {
		// gcd and lcm of two numbers
		int num1=12;
		int num2=18;
		
		System.out.println("lcm of "+num1+" and "+num2+" is "+lcm(num1,num2));
		
		

	}

}
