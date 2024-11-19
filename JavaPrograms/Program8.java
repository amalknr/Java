package JavaPrograms;

public class Program8 {
	static {
		int a=10;
		int b=20;
		System.out.println(a+" "+b);
	}

	public static void main(String[] args) {
		// Static block execute first then execute main method
		
		int c=40;
		int d=50;
		
		System.out.println(c+" "+d);

	}

}
