package ExceptionHandling;

public class Program2 {

	public static void main(String[] args) {
		// NullPointerException
		try {
		String s=null;
		System.out.println(s.length());
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
