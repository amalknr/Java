package ExceptionHandling;

public class Program1 {

	public static void main(String[] args) {
		// Arithemetic excetion
		
		try {
			
			int a=10,b=0;
			
			int c=a / b;
			
			System.out.println(c);
		}
		
		catch (Exception e){
			
			System.out.println(e);
		}

	}

}
