package ExceptionHandling;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// throw exception
		
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			int c=a+b;
			
			if(c<20) {
				throw new ArithmeticException("Sum <20 exception occured");
			}
			else {
				System.out.println(c);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
