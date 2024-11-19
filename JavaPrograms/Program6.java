package JavaPrograms;

public class Program6 {
	
	Program6(){ //Default Constructor
		int a=10;
		int b=40;
		System.out.println(a+b);
	}
	Program6(int c,int d){ //Parameterized Constructor
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		// Constructors constructor name is same as class name

		Program6 sc=new Program6();	
		Program6 sc1=new Program6(30,40);
	}

}
