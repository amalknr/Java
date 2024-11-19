package Arrayss;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		int arr1[][]=new int[size][size];
			
		System.out.println("Enter the size of Second Array");
		int size1=sc.nextInt();	
		int arr2[][]=new int[size1][size1];
		
		System.out.println("Enter the elements of First Array");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr1.length;j++) {
//				System.out.print(arr1[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println("Enter the elements of Second Array");
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				System.out.print(arr2[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int arr3[][]=new int[size][size];
		
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3.length;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		}

}
