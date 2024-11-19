package Logical;

public class Program8 {

	public static void main(String[] args) {
		
		int rows = 4;  // Number of rows to print

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for each element in the row
            for (int j = 1; j <= i; j++) {
                // Print number and corresponding letter
                System.out.print(j + "" + (char)(j + 64) + " ");
            }
            // Move to the next line
            System.out.println();
        }
				

	}

}
