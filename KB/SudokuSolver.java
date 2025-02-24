package KB;

public class SudokuSolver {

    // Check if a number is valid in a specific position
    private static boolean isValid(int[][] board, int row, int col, int num) {
        // Check the row
        for (int c = 0; c < 3; c++) {
            if (board[row][c] == num) {
                return false;
            }
        }

        // Check the column
        for (int r = 0; r < 3; r++) {
            if (board[r][col] == num) {
                return false;
            }
        }

        // The 3x3 grid is itself, no need for sub-grid checks
        return true;
    }

    // Solve the Sudoku using backtracking
    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                // If the cell is empty
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 3; num++) { // Try numbers 1 to 3
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;

                            if (solveSudoku(board)) {
                                return true;
                            }

                            // Backtrack
                            board[row][col] = 0;
                        }
                    }

                    return false; // No valid number found
                }
            }
        }
        return true; // Solved
    }

    // Print the Sudoku board
    private static void printSudoku(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Initialize a 3x3 Sudoku grid with 0s (empty cells)
        int[][] sudoku = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
        };

        // Pre-filled values
        sudoku[0][0] = 1; // First pre-filled value
        sudoku[2][2] = 2; // Second pre-filled value

        System.out.println("Initial Sudoku:");
        printSudoku(sudoku);

        if (solveSudoku(sudoku)) {
            System.out.println("\nSolved Sudoku:");
            printSudoku(sudoku);
        } else {
            System.out.println("\nNo solution exists for the given Sudoku.");
        }
    }
}
