package Logical;

public class Program7 {

	public static void main(String[] args) {
		
		int rows = 4;  // Number of rows to print

        // Outer loop for each row
        for (int i = rows; i >= 1; i--) {
            // Printing leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Printing the increasing part of the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Printing the decreasing part of the numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
	}

}
