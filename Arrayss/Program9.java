package Arrayss;

public class Program9 {

	public static void main(String[] args) {
		// linear search
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		int key=7;
		
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i] ){
			System.out.println(key+" is found at index position "+i);
			}
		}

	}

}
