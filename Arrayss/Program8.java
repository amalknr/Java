package Arrayss;
import java.util.Scanner;


public class Program8 {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the First Array");
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		
		int arr1[][]=new int[size1][size1];
		
		System.out.println("Enter the size of the second array");
		
		int size2=sc.nextInt();
		
		int arr2[][]=new int[size2][size2];
		
		System.out.println("Enter the elements in the First Array");
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=sc.nextInt();
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter the elements in the second array");
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]=sc.nextInt();
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		int arr[][]=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				for(int k=0;k<arr.length;k++) {
					arr[i][j]=arr[i][j]+arr1[i][k]*arr2[k][j];
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
