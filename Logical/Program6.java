package Logical;

public class Program6 {

	public static void main(String[] args) {
		// pattern logical
		int rows = 5;  // Number of rows to print

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Printing leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Printing the increasing part of the numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }

            // Printing the decreasing part of the numbers
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num);
                num--;
            }

            // Move to the next line
            System.out.println();
        }
		

	}

}
