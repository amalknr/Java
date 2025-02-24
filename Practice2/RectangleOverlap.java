package Practice2;
import java.util.Scanner;

class Rectangle{
	public boolean IsOverLapping(int x1_left,int y1_bottom,int x1_right,int y1_top,int x2_left,int y2_bottom,int x2_right,int y2_top) {
		if(x1_right< x2_left || y1_top < y2_bottom) {
			return false;
		}
		return true;
	}
}

public class RectangleOverlap{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the cordinates of first rectangle");
		
		int x1_left=sc.nextInt();
		int y1_bottom=sc.nextInt();
		int x1_right=sc.nextInt();
		int y1_top=sc.nextInt();
		
		System.out.println("Enter the cordinates of Second rectangle");
		
		int x2_left=sc.nextInt();
		int y2_bottom=sc.nextInt();
		int x2_right=sc.nextInt();
		int y2_top=sc.nextInt();
		
		Rectangle obj=new Rectangle();
		
		if(obj.IsOverLapping(x1_left, y1_bottom, x1_right, y1_top, x2_left, y2_bottom, x2_right, y2_top)) {
			System.out.println("Rectangles are overlaping");
		}
		else {
			System.out.println("Rectangles are not overlaped");
		}
		
	}

}
