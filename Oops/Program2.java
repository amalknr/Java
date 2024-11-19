package Oops;

class GrandParant{
	void display1() {
		System.out.print("HIII ");
	}
}
class Parant extends GrandParant{
	void display2() {
		System.out.print("DEAR ");
	}
}
class Child1 extends Parant{
	void display3() {
		System.out.print("AMAL");
	}
}

public class Program2 {

	public static void main(String[] args) {
		// Multilevel Inheritance
		
		Child1 sc=new Child1();
		sc.display1();
		sc.display2();
		sc.display3();
		
		

	}

}
