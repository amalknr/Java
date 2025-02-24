package extra;

import java.util.Scanner;

class Rectangle{

	public boolean is_Overlapping(int x1_left,int y1_bottom,int x1_right,int y1_top,int x2_left, int y2_bottom, int x2_right, int y2_top) {
		if(x1_right< x2_left || y1_top < y2_bottom ) {
			return false;
		}
		else if(x1_left > x2_right || y1_bottom > y2_top) {
			return false;
		}
		return true;
	}
	
	
}


public class Array1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first rectangle cordinates");
		
		int x1_left=sc.nextInt();
		int y1_bottom=sc.nextInt();
		int x1_right=sc.nextInt();
		int y1_top=sc.nextInt();
		
		System.out.println("Enter Second rectangle cordinates");
		
		int x2_left=sc.nextInt();
		int y2_bottom=sc.nextInt();
		int x2_right=sc.nextInt();
		int y2_top=sc.nextInt();
		
		Rectangle rect=new Rectangle();
		
		if(rect.is_Overlapping(x1_left, y1_bottom, x1_right, y1_top,x2_left, y2_bottom, x2_right, y2_top)) {
			System.out.println("the rectangles are overlaping");
		}
		else {
			System.out.println("rectangles are not overlaping");
		}
	}

}
