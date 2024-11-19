package JavaPrograms;

public class Program5 {
	public int sum(int a,int b) { //return type is integer
		
		System.out.print(a+b);
		return a+b;
	}

	public static void main(String[] args) {
		// method with return value
		Program5 sc=new Program5();
		sc.sum(30, 20);

	}

}
