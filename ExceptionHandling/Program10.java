package ExceptionHandling;

public class Program10 {

	public static void main(String[] args) {
		// finally Exception Handling
		
		
		try {
			int a=10,b=0;
			
			int c= a / b;
			
			System.out.println(c);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		finally {
			System.out.println("java");
		}

	}

}
