package ExceptionHandling;

public class Program6 {

	public static void main(String[] args) {
		// StringIndexOutOfBoundException
		
		try {
			
			String str="abc";
			System.out.println(str.charAt(5));
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
