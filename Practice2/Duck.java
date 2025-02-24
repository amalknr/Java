package Practice2;

public class Duck implements Fly,Swim {
	public void fly() {
		 System.out.println("I can fly");
	 }
	public void swim() {
		 System.out.println("I can swim");
	 }
	public static void main(String[] args) {
		Duck sc=new Duck();
		sc.fly();
		sc.swim();

	}

}
