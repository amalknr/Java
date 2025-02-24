package KB;

public class ExceptionThrows {

	public static void main(String[] args) throws ArithmeticException,NullPointerException
	{
		int a=5;
		int b=0;
		int c=a/b;
		System.out.println(c);
		
		String s=null;
		System.out.println(s.length());

	}

}
