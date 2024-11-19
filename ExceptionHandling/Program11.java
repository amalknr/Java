package ExceptionHandling;

class MyCustomException extends Exception{
	
	MyCustomException(String message){
		super(message);
	}
	
}

public class Program11 {

	public static void main(String[] args) {
		// CustomException
		
		try {
			int a=10;
			
			if(a<20) {
				throw new MyCustomException("Number is too small.its should be atleast 20");
			}
			System.out.println(a);
		}
		catch(MyCustomException e){
			System.out.println("Custom exception caught:"+e.getMessage());
		}

	}

}
