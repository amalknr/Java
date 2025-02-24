package Practice2;

public class Array1 {
	public static String LargestNumber(String str,int MaxSwap) {
		char[] newstr=str.toCharArray();
		int n=newstr.length;
		
		for(int i=0;i<n;i++) {
			if(MaxSwap==0) {
				break;
			}
			int MaxIndex=i;
			for(int j=i+1;j<n;j++) {
				if(newstr[j]>newstr[MaxIndex]) {
				MaxIndex=j;
				}
			}
			if(MaxIndex !=i) {
				char temp=newstr[i];
				newstr[i]=newstr[MaxIndex];
				newstr[MaxIndex]=temp;
				
				MaxSwap--;
			}
		}
		return new String(newstr);
	}

	public static void main(String[] args) {
		
		String str="1234567";
		int MaxSwap=4;
		String str1=LargestNumber(str,MaxSwap);
		System.out.println(str1);
	}

}
