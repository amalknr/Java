package Logical;

public class Program4 {

	public static void main(String[] args) {
		// Fibunacci series
		
		int a=0,b=1,c;
		for(int i=1;i<=10;i++) {
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(a+" ");
		}

	}

}
