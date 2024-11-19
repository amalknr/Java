package ExceptionHandling;

public class Program7 {

	public static void main(String[] args) {
		// Multiple ExceptionHandling Methods
		
		try {
			System.out.println("Outer try block");
			
			try {
				System.out.println("Inner try block");
				
				int result=10/0;
				
				System.out.println("Result :"+result);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
			String s=null;
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
