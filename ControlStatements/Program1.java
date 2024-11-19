package ControlStatements;

public class Program1 {

	public static void main(String[] args) {
		//if control statement
		
		int a=10;
		int b=20;
		int c=25;
		
		if(a>b && a>c) {
			System.out.println(a+" is the greater number");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is the greater number");
		}
		else {
			System.out.println(c+" is the greater number");
		}

	}

}
