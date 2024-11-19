package ExceptionHandling;

public class Prrogram5 {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundException
		
		try {
			int a[]=new int[5];
			
			a[10]=30;
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
