package extra;

public class ThrowsP {

	public static void main(String[] args) throws ArithmeticException,NullPointerException {
		
		try {
			int a=10;
			int b=0;
			
			int c=a/b;
			System.out.println(c);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
