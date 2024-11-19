package JavaPrograms;

public class Program7 {
	
	Program7(){ //Default Constructor
		int a=10;
		int b=40;
		System.out.println(a+b);
	}
	public void sum(int c,int d){ 
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		// Construcors and method in a Program

		Program7 sc=new Program7();	
		sc.sum(30, 40);
		
	}

}

