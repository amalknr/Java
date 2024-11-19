package Oops;

public class Program9 {
	
	void sum(int a,float b) {
		System.out.println(a+" "+b);
	}
	
	void sum(float a,int b) {
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		// Polymorphism by method overloading by changing the sequence
		
		Program9 obj=new Program9();
		
		obj.sum(20, 30.f);
		obj.sum(42.4f, 61);
	}

}
