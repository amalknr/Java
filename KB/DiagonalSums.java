package KB;

public class DiagonalSums {
    public static void main(String[] args) {
        // Define the matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 2, 3, 4}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Diagonal sums starting from the right:");

        // Sum diagonals starting from the last column of each row
        for (int startCol = cols - 1; startCol >= 0; startCol--) {
            int sum = 0;
            int row = 0, col = startCol;
            while (row < rows && col < cols) {
                sum += matrix[row][col];
                row++;
                col++;
            }
            System.out.println(sum);
        }

        // Sum diagonals starting from the first column of each row (except the first row)
        for (int startRow = 1; startRow < rows; startRow++) {
            int sum = 0;
            int row = startRow, col = 0;
            while (row < rows && col < cols) {
                sum += matrix[row][col];
                row++;
                col++;
            }
            System.out.println(sum);
        }
    }
}
