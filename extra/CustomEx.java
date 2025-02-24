package extra;

class MyException extends Exception{
	MyException(String message) {
		super(message);
	}
}

public class CustomEx  {

	public static void main(String[] args) {
		
		try {
			int a=20;
			int b=30;
			
			int c=a+b;
			
			if(c>10) {
				throw new MyException("c>10 Exception occured");
			}
			else {
				System.out.println(c);
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}

	}

}
