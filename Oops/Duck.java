package Oops;

public class Duck implements fly,swim {

	public static void main(String[] args) {
		
		Duck obj=new Duck();
		
		obj.sum();
		obj.run();

	}

	@Override
	public void run() {
		System.out.println("I can Swim");
		
	}

	@Override
	public void sum() {

		System.out.println("I can fly");
		
	}

}
