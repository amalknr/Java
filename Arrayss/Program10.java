package Arrayss;

public class Program10 {

	public static void main(String[] args) {
		// Buble sort
		
		int arr[]= {9,8,7,6,5,4,3,2,1};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
			System.out.print(arr[i]+" ");
		}

	}

}
