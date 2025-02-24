package extra;

abstract class Absnew{
	abstract name();
	void run() {
		System.out.println(" Java ");
	}
}

public class AbstractCls extends Absnew {
	
	void name() {
		System.out.println("My name is Amal");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractCls sc=new AbstractCls();
		
		sc.name();
		sc.run();
	}

}
