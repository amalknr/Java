package Oops;

class Override {
	void sum1() {
		System.out.println("java");
	}
}

class OverrideChild extends Override{
	void sum() {
		super.sum1();
	}
}

public class Program10 {

	public static void main(String[] args) {
		// Polymorphism Overriding
		
		OverrideChild obj=new OverrideChild();
		obj.sum();

	}

}
