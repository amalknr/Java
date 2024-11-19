package Arrayss;

public class Program11 {

	public static void main(String[] args) {
		// Binary search
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int key=9;
		
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			
			if(key==arr[mid]) {
				System.out.println(key+" is found at index "+mid);
				break;
			}
			else if(key>arr[mid]) {
				low=mid+1;
			}
			else if(key<arr[mid]) {
				high=mid-1;
			}
			
		}
		if(low>high) {
			System.out.println("element not found");
		}
		

	}

}
