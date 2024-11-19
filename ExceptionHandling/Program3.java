package ExceptionHandling;

public class Program3 {

	public static void main(String[] args) {
		// NumberFormatException
		
		try {
		String s="abc";
		
		int n=Integer.parseInt(s);
		
		System.out.println(n);
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
