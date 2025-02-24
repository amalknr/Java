import java.util.Scanner;

public class rectoverlap {
    
    // Helper method to check if two rectangles overlap
    public static boolean doRectanglesOverlap(int[] rect1, int[] rect2) {
        // Extracting coordinates from the arrays
        int x1a = rect1[0], y1a = rect1[1], x2a = rect1[2], y2a = rect1[3];
        int x1b = rect2[0], y1b = rect2[1], x2b = rect2[2], y2b = rect2[3];
        
        // Checking non-overlap conditions
        if (x2a <= x1b || x2b <= x1a) {
            return false; // Non-overlap horizontally
        }
        if (y2a <= y1b || y2b <= y1a) {
            return false; // Non-overlap vertically
        }
        
        // If none of the non-overlapping conditions hold, the rectangles overlap
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for Rectangle 1
        System.out.println("Enter the coordinates for Rectangle 1 in ordered pair format (e.g., (x1, y1) (x2, y2)): ");
        int[] rect1 = new int[4];
        System.out.print("Bottom-left corner (x1, y1): ");
        rect1[0] = sc.nextInt();  // x1 for Rectangle 1 (bottom-left corner)
        rect1[1] = sc.nextInt();  // y1 for Rectangle 1 (bottom-left corner)
        System.out.print("Top-right corner (x2, y2): ");
        rect1[2] = sc.nextInt();  // x2 for Rectangle 1 (top-right corner)
        rect1[3] = sc.nextInt();  // y2 for Rectangle 1 (top-right corner)
        
        // Input for Rectangle 2
        System.out.println("Enter the coordinates for Rectangle 2 in ordered pair format (e.g., (x1, y1) (x2, y2)): ");
        int[] rect2 = new int[4];
        System.out.print("Bottom-left corner (x1, y1): ");
        rect2[0] = sc.nextInt();  // x1 for Rectangle 2 (bottom-left corner)
        rect2[1] = sc.nextInt();  // y1 for Rectangle 2 (bottom-left corner)
        System.out.print("Top-right corner (x2, y2): ");
        rect2[2] = sc.nextInt();  // x2 for Rectangle 2 (top-right corner)
        rect2[3] = sc.nextInt();  // y2 for Rectangle 2 (top-right corner)
        
        // Check if the rectangles overlap
        boolean result = doRectanglesOverlap(rect1, rect2);
        
        if (result) {
            System.out.println("The rectangles overlap.");
        } else {
            System.out.println("The rectangles do not overlap.");
        }
        
        sc.close();
    }
}
