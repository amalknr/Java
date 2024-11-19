package Oops;

class Single{
	void display() {
		System.out.print("Hiii ");
	}
}
class Child extends Single{
	void sum() {
		System.out.print("Amal");
	}
}

public class Program1 {

	public static void main(String[] args) {
		
		// Single Inheritance
		
		Child sc=new Child();
		
		sc.display();
		sc.sum();
		

	}

}
