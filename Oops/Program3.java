package Oops;

class Parant1{
	void display1() {
		System.out.print("HIII ");
	}
}
class Child3 extends Parant1{
	void display2() {
		System.out.print("DEAR ");
	}
}
class Child2 extends Parant{
	void display3() {
		System.out.print("AMAL ");
	}
}

public class Program3 {

	public static void main(String[] args) {
		// hierarchical inheritance
		
		Child3 sc=new Child3();
		Child2 sc1=new Child2();
		
		sc.display1();
		sc.display2();
		sc1.display3();

	}

}
