package extra;
import java.util.Scanner;

public class Product {

	String pcode;
    String pname;
    double price;

    // Constructor
    public Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    // Method to display product details
    public void display() {
        System.out.println("Product Code: " + pcode);
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array to store 3 products
        Product[] products = new Product[3];

        // Input product details from user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for Product " + (i + 1) + ":");
            
            System.out.print("Enter Product Code: ");
            String pcode = sc.nextLine();
            
            System.out.print("Enter Product Name: ");
            String pname = sc.nextLine();
            
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            
            sc.nextLine(); // Consume newline character after price

            // Creating product object and storing it in array
            products[i] = new Product(pcode, pname, price);
        }

        // Find the product with the lowest price
        Product lowestPriceProduct = products[0];

        for (int i = 1; i < products.length; i++) {
            if (products[i].price < lowestPriceProduct.price) {
                lowestPriceProduct = products[i];
            }
        }

        // Display the product with the lowest price
        System.out.println("\nProduct with the lowest price:");
        lowestPriceProduct.display();

        sc.close();
}
}