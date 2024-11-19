package ExceptionHandling;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) throws ArithmeticException,NullPointerException
	{
		// throws exception
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=a/b;
		System.out.println(c);
		
		String s=null;
		System.out.println(s.length());
	

}
}
