package ControlStatements;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// Switch control Statement
		System.out.println("enter your choice: 1 for Biriyani,2 for Porotta,3 for Chappathi,4 for Ediappam :");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Your order is Biriyani We are prepare for you");
			break;
		case 2:
			System.out.println("Your order is Porotta We are prepare for you");
			break;
		case 3:
			System.out.println("Your order is Chappathi We are prepare for you");
			break;
		case 4:
			System.out.println("Your order is Ediappam We are prepare for you");
			break;
		default:
			System.out.println("NO CHOICE");
		}
	}

}
