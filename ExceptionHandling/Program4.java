package ExceptionHandling;

public class Program4 {

	public static void main(String[] args) {
		// NumberFormatException
		
		String str="123";
		
		try {
			
			int num=Integer.parseInt(str);
			
			System.out.println("Orginal String "+str);
			System.out.println("Converted Integer "+num);
		}
		catch (NumberFormatException e) {
			System.out.println("Error"+e.getMessage());
		}

	}

}
