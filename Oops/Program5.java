package Oops;

abstract class Absnew{
	abstract sum1();
	void run() {
		System.out.println("java");
	}
}
public class Program5 extends Absnew {
	
	void sum1() {
		
		String S="new";
		System.out.println(S);
	}

	public static void main(String[] args) {
		
		Program5 sc=new Program5();
		
		sc.run();
		sc.sum1();
		

	}

}
