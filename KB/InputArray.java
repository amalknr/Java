package KB;

import java.util.Scanner;
public class InputArray {

	public static void main(String[] args) {
		// Input an element at third position
		
		int [] arr= {35,24,20,32,26,27,34};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter index position");
		
		int index=sc.nextInt();
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		for(int i=arr.length-1;i>index;i--) {
			arr[i]=arr[i-1];
		}
		
		arr[index]=num;
		
		for(int number : arr) {
		
		System.out.print(number+" ");
		}

	}

}
