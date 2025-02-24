package extra;

public class ThrowP {

	public static void main(String[] args) {
		
		try {
			int a=10;
			int b=30;
			
			if(b>10) {
			throw new ArithmeticException("b>10 Exception occured");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
