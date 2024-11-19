package Oops;

public class Program8 {
	
	void sum() {
		int a=10;
		System.out.println(a);
	}
	
	void sum(int b) {
		System.out.println(b);
	}
	void sum(int c,float e) {
		System.out.println(c+" "+e);
	}

	public static void main(String[] args) {
		// Polymorphism Method overloading
		
		Program8 obj=new Program8();
		obj.sum();
		obj.sum(19);
		obj.sum(4, 2.4f);

	}

}
