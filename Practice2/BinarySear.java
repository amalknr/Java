package Practice2;

public class BinarySear {

	public static void main(String[] args) {
		int [] arr= {12,14,16,17,60,90,120};
		
		int low=0;
		int high=arr.length-1;
		
		int key=60;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key ){
				System.out.println("Searching Element is "+key+" at index positin "+mid);
				break;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else if(arr[mid]>key) {
				high=mid-1;
			}
		}
		if(low>high) {
			System.out.println("Element is not present in the Array");
		}

	}

}
