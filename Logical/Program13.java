package Logical;

public class Program13 {

		public static int gcd(int a,int b) {
			while(b !=0 ) {
				int temp=b;
				b=a % b;
				a=temp;
			}
			return a;
			
		}
		
		public void lcm(int a,int b) {
			int c=(a * b)/gcd(a,b); 
			System.out.println("lcm is "+c);
			System.out.println("Gcd is"+gcd(a,b));
			
		}

		public static void main(String[] args) {
			// gcd and lcm of two numbers
			
			Program13 obj=new Program13();
			
			obj.lcm(12, 18);
			
	}

}
