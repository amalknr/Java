package extra;

public class Program6 {

	public static void main(String[] args) {
		// Sorted String
		
		String str[]= {"banana","orange","grape","apple"};
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length-1;j++) {
				if(str[i].compareTo(str[j])>0) {
					String temp=str[i];
					str[i]=str[j];
					str[i]=temp;
				}	
			}
			
		}
		for(int v=0;v<str.length;v++) {
			System.out.println(str[v]);
		}
	}

}
