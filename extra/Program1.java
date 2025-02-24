package extra;

import java.util.Scanner;

public class Program1 {
	
	int pcode;
	String pname;
	double price;
	
	public Program1(int pcode,String pname,int price) {
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	
	public void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }

	public static void main(String[] args) {
		// Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of the class and find the product having the lowest price. 
		System.out.println("Enter the Number of Products");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		Program1 []products=new Program1[size];
		
		for(int i=0;i<products.length;i++) {
			System.out.println("Enter the Product code");
			int pcode=sc.nextInt();
			
			sc.nextLine();
			
			System.err.println("Enter the product name");
			String pname=sc.nextLine();
			
			
			System.err.println("Enter the product price");
			int price=sc.nextInt();
			
			
			
			products[i] = new Program1(pcode, pname, price);
;			
		}
		
		
		Program1 lowstPrice=products[0];
		
		for(int i=1;i<products.length;i++) {
			
			if(products[i].price<lowstPrice.price) {
				lowstPrice=products[i];
			}
		}
		lowstPrice.display();
		
		
	}

}
