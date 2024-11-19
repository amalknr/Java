package JavaPrograms;

public class Program3 {
	static int d=50;//static variable because it declare using static keyword
	int c=40;//Instance variable because it declare inside the class but outside the method
	
	public void sum() {
		int a=10;//Local variable because declare inside the method
		int b=20;//Local variable because declare inside the method
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// Local Varible
		//Instance Variable
		
		Program3 sc=new Program3();
		sc.sum();
		System.out.println(sc.c);
		System.out.println(d);//d is a static variable so we can call directly without object 

	}

}
